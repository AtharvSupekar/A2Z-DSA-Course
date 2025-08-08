import subprocess
import sys
from pathlib import Path

# Get the script file from args
target_file = Path(sys.argv[1])
target_dir = target_file.parent

input_file = target_dir / "input.txt"
output_file = target_dir / "output.txt"

if not input_file.exists():
    print(f"⚠️ input.txt not found in {target_dir}")
    sys.exit(1)

with open(input_file, 'r') as infile, open(output_file, 'w') as outfile:
    result = subprocess.run(
        ["python", target_file.name],
        stdin=infile,
        stdout=outfile,
        stderr=subprocess.STDOUT,
        cwd=target_dir  # run inside target script's folder
    )

    if result.returncode == 0:
        print(f"✅ Output written to {output_file}")
    else:
        print(f"❌ Error occurred while running {target_file}")
