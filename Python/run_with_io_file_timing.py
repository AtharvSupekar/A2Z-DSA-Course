import subprocess
import sys
from pathlib import Path
import time

# Get the script file from args
if len(sys.argv) < 2:
    print("Usage: python run_with_io.py <path_to_solution_file.py>")
    sys.exit(1)

target_file = Path(sys.argv[1])
target_dir = target_file.parent

input_file = target_dir / "input.txt"
output_file = target_dir / "output.txt"

if not input_file.exists():
    print(f"⚠️ input.txt not found in {target_dir}")
    sys.exit(1)

# Start the timer
start_time = time.time()

try:
    # Run the solution script, capturing its output
    with open(input_file, 'r') as infile:
        result = subprocess.run(
            ["python", target_file.name],
            stdin=infile,
            capture_output=True,  # Captures stdout and stderr
            text=True,  # Decodes stdout/stderr as text
            cwd=target_dir  # run inside target script's folder
        )

    end_time = time.time()

    # Write the output and timing metrics to the output file
    with open(output_file, 'w') as outfile:
        # Write the captured output from the solution file
        outfile.write(result.stdout)

        # Append the performance metrics
        outfile.write(f"\n\n--- Performance Metrics ---\n")
        outfile.write(f"Runtime: {end_time - start_time:.4f} seconds\n")

    if result.returncode == 0:
        print(f"✅ Output and metrics written to {output_file}")
    else:
        print(f"❌ Error occurred while running {target_file}")
        print(f"Error details:\n{result.stderr}")

except Exception as e:
    print(f"❌ An unexpected error occurred: {e}")
    sys.exit(1)