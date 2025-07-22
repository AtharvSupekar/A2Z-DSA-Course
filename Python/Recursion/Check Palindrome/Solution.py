def is_Palindrome(i: int, s: str) -> bool:
    # Base Condition
    if i>= len(s) // 2:
        return True;
    # Palindrome Check
    if s[i] != s[len(s) - i - 1]:
        return False
    # Recursive Call
    return is_Palindrome(i+1, s)
    


t = int(input())
while t > 0:
    t -= 1
    s = input()
    s = s.lower().replace(" ", "")
    if not s or s.isalnum() == False:
        print("Invalid input, please enter a valid string.")
        continue
    print(is_Palindrome(0, s))
    
