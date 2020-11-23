# 抽象工厂

抽象工厂适用于多等级产品的模式，例如游戏公司可能还会有其他业务。当只有一个级别时会退化成工厂方法。

## 示例说明
1. 通用游戏类
2. 各个游戏子类继承通用游戏类
3. 抽象厂商类
4. 各个游戏厂商继承通用游戏厂商类

## 角色
1. 抽象工厂：AbstractFactory
2. 具体工厂：Alibaba\Tencent
2. 抽象产品：Game\SoftWare（多品类）
3. 具体产品：FpsGame\MobaGame\RtsGame\DingTalk\QQ\Wechat\ZhiFuBao