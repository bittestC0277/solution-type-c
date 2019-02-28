package problem02;

public class MyService extends BaseService {
	
	
	@Override
	public void service(String state) {
		// TODO Auto-generated method stub
//		super.service(state);
		String result;
		if(state.equals("낮")) {
			result = day();
		}else if(state.equals("밤")) {
			result = night();
		}else {
			result = afternoon();
		}
		System.out.println(result+"서비스시작");
	}

	public String afternoon() {
		return "오후";
	}
}
