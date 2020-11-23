# 单例模式
保证应用中只有一个实例。

## 原因
1. 防止出现多个实例引起错误。
2. 减少创建多个资源的浪费。

## 饿汉式
1. 静态变量或者静态代码块new实例。
2. 构造方法为private。
3. 提供一个公共的getInstance方法，返回单例类。
4. 实现简单，避免线程同步的问题。
5. 无法实现懒加载，一定的内存浪费。

## 懒汉式(线程安全)
1. 定义一个静态的单例类类型变量。
2. 构造方法为private。
3. 提供一个公共的且线程安全的getInstance方法，如果变量为mull,则new一个实例，然后返回单例类。
4. 效率低下