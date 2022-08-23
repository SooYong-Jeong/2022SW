import pickle

def Score_Input():
    while 1:
        number = input('학번을 입력하세요.')
        if student.get(number) == None:
            Name = input('이름을 입력하세요.')
            Kor = input('국어 성적을 입력하세요.')
            Eng = input('영어 성적을 입력하세요.')
            Math = input('수학 성적을 입력하세요.')
            student[number] = [Name, Kor, Eng, Math]
            break
        elif number == 0:
            break
        else:
            print('Error : 중복된 학번입니다.')

def Score_Print():
    print('학번\t 이름\t국어\t영어\t수학\t총점')
    for key, value in student.items():
        print(key ,end = '\t')
        for i in value:
            print(i, end = '\t')
        sum = int(value[1]) + int(value[2]) + int(value[3])
        print(sum)

def Score_Search():
    What_Name = input('이름을 입력하세요.')
    for key, i in student.items():
        if i[0] == What_Name:
            print('학번\t 이름\t국어\t영어\t수학')
            print(key, end = '\t')
            for j in i:
                print(j, end = '\t')

def Score_Modify():
    number = input('변경할 학생의 학번을 입력하세요.')
    while 1:
        print('이름\t국어\t영어\t수학')
        for i in student.get(number):
            print(i, end = '\t')
        cho = input('변경할 항목을 선택입력(q : 종료)')
        if cho == '이름':
            Name = input('변경할 이름을 입력하세요.')
            student[number][0] = Name
        elif cho == '국어':
            Kor = input('변경할 국어 성적을 입력하세요.')
            student[number][1] = Kor
        elif cho == '영어':
            Eng = input('변경할 영어 성적을 입력하세요.')
            student[number][2] = Eng
        elif cho == '수학':
            Math = input('변경할 수학 성적을 입력하세요.')
            student[number][3] = Math
        elif cho == 'q':
            break
        else: print('잘못된 입력')

def Score_Delet():
    number = input('삭제할 학생의 학번을 입력하세요.')
    print('학번\t 이름\t국어\t영어\t수학')
    print(number, end = '\t')
    for i in student.get(number):
        print(i, end = '\t')
    delch = input('삭제하시겠습니까? Y/N')
    if delch == 'Y':
        del student[number]

    print('학번\t 이름\t국어\t영어\t수학')
    for key, value in student.items():
        print(key ,end = '\t')
        for i in value:
            print(i, end = '\t')

def Score_List():
    Score_sum = {}
    for key, value in student.items():
        sum = int(value[1]) + int(value[2]) + int(value[3])
        Score_sum[key] = sum
    rank = 1
    print('등수\t학번\t이름\t국어\t영어\t수학\t합계')
    for i in [x[0] for x in sorted(Score_sum.items(), key=lambda x: x[1], reverse = True)]:
        print(rank,'\t', i, end = '\t')
        for j in student[i]:
            print(j, end = '\t')
        print(Score_sum[i])
        rank += 1

def Score_Save():
    with open("student.pkl",'wb') as f:
        pickle.dump(student, f)


#with open('students.pkl','rb') as f:
#    student = pickle.load(f)
student = {}
choice = 1
while choice != 0:
    choice = input('''1.학생성적 입력
2.학생성적 전체출력
3.학생조회 
4.학생성적 수정
5.학생성적 삭제
6.학생 리스트
0.종료
''')
    if choice == '1':
        Score_Input()
    elif choice == '2':
        Score_Print()
    elif choice == '3':
        Score_Search()
    elif choice == '4':
        Score_Modify()
    elif choice == '5':
        Score_Delet()
    elif choice == '6':
        Score_List()
    elif choice == '0':
        break    
    else: print('잘못된 입력.')

Score_Save()
    