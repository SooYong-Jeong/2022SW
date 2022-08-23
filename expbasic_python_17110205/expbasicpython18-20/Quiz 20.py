import re

custlist = [{'name':'홍길동','gender':'M','email':'hong123@gmail.com','birthyear':'2000'},
          {'name':'박철수','gender':'M','email':'park123@gmail.com','birthyear':'2001'},
          {'name':'김나리','gender':'F','email':'kim123@gmail.com','birthyear':'1999'}]

page = 2

def exe(choice,page):
    if choice == '1':
        page = insertData(page)
        print(page)
    elif choice =='C':
        curSearch(page)
    elif choice == 'P':
        page = preSearch(page)
    elif choice == 'N':
        page = nextSearch(page)
    elif choice == 'U':
        updataData(page)
    elif choice == 'D':
        page = deleteData(page)
    elif choice == 'Q':
        quit()
    return page

def insertData(page):
    print("고객 정보 입력")
    customer = {'name':'','gender':'','birthyear':''}
    customer['name']=input('이름을 입력하세요 : ')
    while True:
        customer['gender'] = input('성별(M/F)을 입력하세요 : ').upper()
        if customer['gender'] in ('M', 'F'):
            break

        while True:
            customer['email'] = input("이메일을 입력하세요 : ")
            check = 0
            for i in custlist:
                if i['email'] == customer['email']:
                    check = 1

            p = re.compile('^[a-z][a-z0-9]{4,}@[a-z]{2,}[.][a-z]{2,5}$')
            result = p.match(customer['email'])
            if result != None and check == 0:
                break
            elif result == None:
                print('@를 포함하여 정확한 이메일을 입력하세요')
            elif check == 1:
                print('중복되는 이메일이 있습니다.')

        while True:
            customer['birthyear'] = input('출생년도 4자리를 입력 : ')
            if len(customer['birthyear']) == 4 and customer['birthyear'].isdigit():
                break
        custlist.append(customer)
        page += 1
        print(customer)
        print(custlist)
        print(page)
        return page

def curSearch(page):
    print('현재 고객 정보 조회')
    if page >= 0:
        print('현재 페이지는 {}쪽 입니다.'.format(page+1))
        print(custlist[page])
    else:
        print("입력된 정보가 없습니다.")

def preSearch(page):
    print('이전 고객 정보 조회')
    if page <= 0:
        print("첫 번째 페이지 입니다. 이전페이지로 이동이 불가능합니다.")
        print(custlist[page])
    else:
        page -= 1
        print('현재 페이지는 {}쪽입니다.'.format(page + 1))
        print(custlist[page])
    return page

def nextSearch(page):
    print('다음 고객 정보 조회')
    if page >= len(custlist) - 1:
        print('마지막 페이지입니다. 다음 페이지로 이동이 불가능 합니다.')
        print(custlist[page])
    else:
        page += 1
        print('현재 페이지는 {}쪽 입니다.'.format(page + 1))
        print(custlist[page])
    return page

def updataData(page):
    while True:
        choice1 = input('수정하려는 고객 정보의 이메일 주소를 입력하세요 : ')
        idx = -1
        for i in range(0, len(custlist)):
            if custlist[i]['email'] == choice1:
                idx = i
                break
        if idx == -1:
            print('등록되지 않은 이메일입니다.')
            break
        choice2 = input('수정하실 정보를 선택하세요(name, gender, birthyear) 종료 : exit')
        if choice2 in ('name', 'gender', 'birthyear'):
            custlist[idx][choice2] = input('수정할 {}를 입력하세요'.format(choice2))
            break
        elif choice2 == 'exit':
            break
        else:
            print('존재하지 않는 정보입니다.')
            break
    return page

def deleteData(page):
    choice1 = input('삭제하려는 고객정보의 이메일을 입력하세요')
    delok = 0
    for i in range(0, len(custlist)):
        if custlist[i]['email'] == choice1:
            print('{} 고객님의 정보가 삭제되었습니다.'.format(custlist[i]['name']))
            del custlist[i]
            delok = 1
            break
    if delok == 0:
        print('등록되지 않은 고객 정보입니다.')
    print(custlist)
    return page

def quit():
    print('프로그램이 종료 되었습니다.')

while True:
    choice = input('''
    다음 중에서 하실 작업을 골라주세요 :
    I - 고객 정보 입력
    C - 현재 고객 정보 조회
    P - 이전 고객 정보 조회
    N - 다음 고객 정보 고회
    U - 고객 정보 수집
    D - 고객 정보 삭제
    Q - 프로그램 종료
    메뉴입력 :''').upper()
    page = exe(choice,page)