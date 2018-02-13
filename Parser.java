	public static void main(String[] args) {

		String stringAndNumericRegex = "^(-{2})([a-zA-Z]+?)=([a-zA-Z]+?|[0-9]+?)$";

		String timeStampRegex = "^(-{2})([a-zA-Z]+?)=([0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9])$";

		Pattern pattern = Pattern.compile(stringAndNumericRegex, Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher("--key=value");

		matcher.find();
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
		System.out.println(matcher.group(3));

	}
