package person.zd.gof23;

/**
 * @ClassName: SingletonDemo02
 * @Description: 双重检查机制 懒汉式 单例模式
 * @author Gene
 * @date 2017年4月27日 下午5:31:40
 */
public class SingletonDemo02 {

	private static SingletonDemo02 instance;

	private SingletonDemo02() {} //类的外部不能实例化

	public static SingletonDemo02 getInstance() {

		if (null == instance) { //第一重检查：因为大多数情况下已存在实例，这里检查会提升效率
			synchronized(SingletonDemo02.class){
				if(null == instance){//第二重检查：针对第一次实例未创建的情况，控制多线程出现的问题
					instance = new SingletonDemo02();
				}
			}
			
		}

		return instance;
	}
	
	

}
