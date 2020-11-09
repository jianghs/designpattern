# 工厂模式

## 静态工厂

类 + 静态方法，一般用于 Util 类。

## 简单工厂

### 示例说明
1. 通用游戏类
2. 各个游戏子类继承通用游戏类
3. 游戏类工厂生产各个游戏子类
4. Main 通过游戏类工厂生产游戏，根据 java 的多态实现。

### 角色
1. 简单工厂：GameFactory
2. 抽象产品：Game
3. 具体产品：CsGo\Dota\WarCraft

## 工厂方法

工厂方法是在抽象工厂的基础上，对工厂再进行抽象。

### 示例说明
1. 通用游戏类
2. 各个游戏子类继承通用游戏类
3. 通用游戏厂商类
4. 各个游戏厂商继承通用游戏厂商类

### 角色
1. 抽象工厂：GamePlatform
2. 具体工厂：Blizzard\Valve
2. 抽象产品：Game
3. 具体产品：CsGo\Dota\WarCraft

## 抽象工厂

抽象工厂适用于多等级产品的模式，例如游戏公司可能还会有其他业务。当只有一个级别时会退化成工厂方法。

### 示例说明
1. 通用游戏类
2. 各个游戏子类继承通用游戏类
3. 抽象厂商类
4. 各个游戏厂商继承通用游戏厂商类

### 角色
1. 抽象工厂：AbstractFactory
2. 具体工厂：Alibaba\Tencent
2. 抽象产品：Game\SoftWare（多品类）
3. 具体产品：FpsGame\MobaGame\RtsGame\DingTalk\QQ\Wechat\ZhiFuBao