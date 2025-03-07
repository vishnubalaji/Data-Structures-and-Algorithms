def permute(inp_lis, i, length):
    if i==length:
        print(''.join(inp_lis))
    else:
        for j in range(i,length):
            inp_lis[i],inp_lis[j] = inp_lis[j],inp_lis[i]
            permute(inp_lis, i+1, length)
            inp_lis[i],inp_lis[j] = inp_lis[j],inp_lis[i]

try:
    while(True):
        inp_str = input("Please enter the string to find its permutations : ")
        inp_lis = list(inp_str)
        permute(inp_lis, 0, len(inp_lis))
except(KeyboardInterrupt):
    print("\nThank you for running me! ;)")