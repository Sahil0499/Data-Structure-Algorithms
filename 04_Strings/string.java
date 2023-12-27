// String is a sequence of characters. In java, objects of String are immutable which means a constant and cannot be changed once created.

// There are two ways to create string in Java:
// 1.) String literal
//        String s1 = “GeeksforGeeks”;
//        String s2 = “GeeksforGeeks”; 
// 2.) Using new keyword(object)
//        String s3 = new String (“GeeksforGeeks”);
//        String s4 = new String (“GeeksforGeeks”);

// s1=s2(true) -> If the string already exists, the new reference variable will be pointing to the already existing literal.
// s1!=s3 & s3!=s4 since -> Even the string already exists or not, a new string object will be created. therefore s3 is also not equal to s4.
// S1.equals(S3) => returns boolean value(true)
// In general, you should use the string literal notation when possible. It is easier to read and it gives the compiler a chance to optimize your code.

