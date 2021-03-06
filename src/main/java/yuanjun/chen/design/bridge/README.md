##桥接模式
1.桥接模式的优点  
（1）实现了抽象和实现部分的分离    
桥接模式分离了抽象部分和实现部分，从而极大的提供了系统的灵活性，让抽象部分和实现部分独立开来，分别定义接口，这有助于系统进行分层设计，从而产生更好的结构化系统。  
对于系统的高层部分，只需要知道抽象部分和实现部分的接口就可以了。  
（2）更好的可扩展性  
由于桥接模式把抽象部分和实现部分分离了，从而分别定义接口，这就使得抽象部分和实现部分可以分别独立扩展，而不会相互影响，大大的提供了系统的可扩展性。  
（3）可动态的切换实现  
由于桥接模式实现了抽象和实现的分离，所以在实现桥接模式时，就可以实现动态的选择和使用具体的实现。  
（4）实现细节对客户端透明，可以对用户隐藏实现细节。 