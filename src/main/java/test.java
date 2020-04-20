
public class test {

	public static void main(String[] args) {
		String xpath= "(//*[@class='card-body']/div/../..)[&&]/..//*[contains(@id,\"Module\")]/div/ul/*";
		for(int j=0;j<4;j++) {
			xpath= "(//*[@class='card-body']/div/../..)[&&]/..//*[contains(@id,\"Module\")]/div/ul/*";
			xpath = xpath.replace("&&", (j+3)+"");
			System.out.println(xpath);
	}
}
}
