
package com.facebook.all;

public class All {

public static String rainbowname(String name) {
		  String[] colours = new String[]{"#ff2400", "#b93e29", "#b88028", "#a0d12f", "#2bb628", "#135716", "#53a2d9", "#2c68ca", "#3425aa", "#2a229d", "#612cc9", "ca3cd4"};
		  int x = 0;
		  StringBuilder str = new StringBuilder();
		  for (char c : name.toCharArray()) {
			  if (x < colours.length) {
				  str.append(colours[x] + "#ca3cd4" + c);
				  x++;
			  }else {
				  x = 0;
			  }
		  }
		  return str.toString();
	  }
}
