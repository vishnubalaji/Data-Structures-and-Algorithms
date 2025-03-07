from collections import Counter

# t = int(input())
t = 1

for i in range(t):
    # input_ = input().split(' ')
    # n_animals = int(input_[0])
    # dogs = int(input_[1])
    # cats = int(input_[2])
    # m_extra = int(input_[3])
    
    # n_animals, dogs, cats, m_extra = map(int,input.split(' '))

    n_animals = 8
    dogs = 2
    cats = 1
    m_extra = 3

    status = 'YES'

    # pattern = list(input())
    pattern = list('DCCCCCDC')
    dict_animals = Counter(pattern)
    
    for i in pattern:
        if i == 'C':
            if cats>0:
                cats = cats-1
            else:
                if dict_animals['D'] == 0:
                    status ='YES'
                    break
                else:
                    status = 'NO'
                    break
        elif i == 'D':
            if dogs>0:
                dogs = dogs - 1
                dict_animals['D'] = dict_animals['D']-1
                cats = cats+m_extra
            else:
                status = 'NO'
                break
        else:
            pass
    print(status)
    
    # if(dict_animals['D']==0):
    #     print('YES')
    # else:
    #     print('NO')
    