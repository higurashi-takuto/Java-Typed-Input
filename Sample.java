class Main {
	public static void main(String[] args) {
		int i = Input.readInt("好きな数字は？（int）");
		double d = Input.readDouble("好きな数字は？（double）");
		String s = Input.readString("好きな文字列は？（string）");

		System.out.println(i + "\n" + d + "\n" + s);
	}
}