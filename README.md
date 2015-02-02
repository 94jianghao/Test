ut-workshop
===========

workshop内容： 用TDD（Test Driven Development）开发一个简单的猜数字游戏：

- 游戏开始后，系统会随机给出四个不重复的数字。由用户输入自己猜测的四个数字。
- 如果数字猜对而且位置也对，就是1一个A。
- 如果数字猜对但位置不对，就是一个B。
- 返回结果是如“2A1B”这样的字串。

例如：

- 系统给出"1234"，用户输入"1234"
 - 返回"4A0B"
- 系统给出"1234"，用户输入"4321"
 - 返回"0A4B"

workshop过程
- 共有三问
- 每一问先写代码，然后展示代码，大家集体讨论，然后开始下一问（具体内容到现场提供）

需要准备的：

- 自带笔记本
- IntelliJ CE 装好
- clone本项目，执行mvn test能通过




GuessNumber
Guess Number Game    

- 总览      
	用TDD（Test Driven Development）开发一个简单的猜数字游戏，基本业务逻辑如下：

	游戏开始后，系统会随机给出一个四位，每位都不重复的数字作为答案。由用户输入自己猜测的四个数字。
	系统会将两个数字进行对比，并给形出xAxB的提示， 比如"2A1B"。
	如果数字猜对而且位置也对，就是一个A。
	如果数字猜对但位置不对，就是一个B。
	例如：

	系统给出"1234"，用户输入"1234"
	返回"4A0B"
	系统给出"1234"，用户输入"4321"
	返回"0A4B"


- 第一问 xAxB       

	写一个CompareNumber类，只有一个函数，该函数接受两个参数，一个是答案，一个是用户输入的四位数。
	返回值是xAxB的字符串 这里我们假定答案和用户输入都是合法的四位数。不用考虑数字合法性问题。
	 请对这个类写测试（思考要写几个测试）

- 第二问 随机数生成       
  
	写一个AnswerGenerator类，只有一个函数，返回一个四位，每位都不重复随机数。
	连续三次产生的随机数不能相同。
	 请对这个类写测试。（思考测试有哪些）

- 第三问      

	写一个Game类，还是只有一个函数，但是只有一个参数。把前两问做的类集成起来，写一个集成的单元测试，写一个集成测试。

	每回游戏有六次机会。每输入一次数字就会减少一次机会并打印xAxB。
	当游戏开始时，打印“Welcome!”空一行打印 "Please input your number(6): "
	每次输入完并敲击回车，就会在下面打印出xAxB，然后空一行打印出新的"Please input your number(x): "
	当6次都没有猜中的时候，打印"Game Over"并退出
	当猜中的时候，不要打印4A0B,而是打印"Congratulations!"并退出
