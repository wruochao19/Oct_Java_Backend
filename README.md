# Oct_Java_Backend
## Day1 Exercise
- 建立如下的student类.

![alt text](https://github.com/wruochao19/Leetcode-Note/blob/main/Images/240-2.PNG)

- 创建3个Student对象并存入数组中.

```Student[] students = new Student[]{new Student("a"), new Student("b"), new Student("c")};```

- 从键盘分别输入他们的成绩.

```
for(...){
  Scanner sc = new Scanner(System.in);
  ...
  System.out.printf("请输入学生%d的成绩:",i+1);
  ...
  students[i].setGrade(input);
  ...
}
```

- 按成绩从高到低打印出他们.
```
for(Student student: students){
  System.out.println(student);
}
```

**Example 1**
```
输入学生1的成绩：
80
输入学生2的成绩：
90
输入学生3的成绩：
70

输出:
Student{name='a', grade=90}
Student{name='b', grade=80}
Student{name='c', grade=70}
```
