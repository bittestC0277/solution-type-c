package problem02;

public class MyService extends BaseService {
	
	
	@Override
	public void service(String state) {
		// TODO Auto-generated method stub
//		super.service(state);
		System.out.println(state+"서비스시작");
	}

	public String afternoon() {
		return "오후";
	}
}
