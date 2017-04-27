package person.zd.gof23;


/**
 * @ClassName: SingletonDemo01
 * @Description: 静态内部类形式+懒汉式 单例模式
 * @author Gene
 * @date 2017年4月27日 下午4:32:07
 */
public class SingletonDemo01 {
	
	private SingletonDemo01(){}
	
	private static class SingletonInstance{
		private static final SingletonDemo01 instance = new SingletonDemo01();
	}
	
	public static SingletonDemo01 getInstance(){
		
		return SingletonInstance.instance;
		
	}
}
