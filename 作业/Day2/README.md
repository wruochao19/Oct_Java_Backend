## Day 2
### 编写一个项目，模拟的对数据库CRUD的操作。


- 编写``` Controller ```类，实现接收键盘上的输入指令，并通过 ```Controller```调用```Service```接口的实现类来完成具体操作

```
Add,<ID>,<NAME>,<GRADE>          //添加学生 
Get,<ID>                         //查找学生
GetAll                           //按要求输出所有学生
Update,<ID>,<NAME>,<GRADE>       //更新学生
Del,<ID>                         //删除学生
```

- 编写```ServiceImpl```类来实现```Service```接口的中抽象方法

- 完善```Dao```类, 用```HashMap<key, Student>```来模拟数据库，并实现对数据库的CURD操作

#### 详细结构

```
- project 根目录
    - entity
          - Student     (学生实体类
    - Controller        (Controller类, 提供main方法，接受键盘输入指令, 并调用Service对象实现相应指令
    - service
          - Service     (Service接口
          - ServiceImpl (Service实现类, 提供相应方法的具体实现，并调用Dao对象来对数据库进行操作
    - Dao               (Dao类, 使用HashMap模拟数据库, 并实现数据对数据库的CRUD操作
```
