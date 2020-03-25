package com.human.ex;

public class classStart8 {

	public static void main(String[] args) {
		 String dna = "GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA"
                 + "CCACGCCCGGCTAATTTTTATTTATTTATTTAAAGACAGAGTCTCACTCT"
                 + "GTCACTCAGGCTAGAGTGCAGTGGCACCATCTCAGCTCACTGCAGCCTTG"
                 + "ACCTCCCTGGGCTCCGGTGATTTCACCCTCCCAAGTAGCTAGGACTACAG"
                 + "GCACATGCCACGACACCCAGCTAATTTTTTATTTTCTGTGAAGTCAAGGT"
                 + "CTTGCTACGTTGCCCATGCTGGTATCAAACCCCTGGGCTCAATCAATCCT"
                 + "TCCACCTCAGCCTCCCCAAGTATTGGGGTTACAGGCATGAGCTACCACAC"
                 + "TCAGCCCTAGCCTACTTGAAACGTGTTCAGAGCATTTAAGTTACCCTACA"
                 + "GTTGGGCAAAGTCATCTAACACAAAGCCCTTTTTATAGTAATAAAATGTT"
                 + "GTATATCTCATGTGATTTATTGAATATTGTTACTGAAAGTGAGAAACAGC"
                 + "ATGGTTGCATGAAAGGAGGCACAGTCGAGCCAGGCACAGCCTGGGCGCAG"
                 + "AGCGAGACTCAAAAAAAGAAAAGGCCAGGCGCACTGGCTCACGCCTGTAA"
                 + "TCCCAGCATTTCGGGAGGCTGAGGCGGGTGGATCACCTGAGGTCAGGAGT"
                 + "TCAAGACCAGCCTAGCCAACATGGTGAAACCCCGTCTCTACTAAAATACA"
                 + "AAAATTAACCGGGCGTGATGGCAGGTGCCTGTAATCCCAGCTACTTGGGA"
                 + "GGCTGAGGCAGGAGAATCGCTTGAACCAGGAGGCGGAGGTTGCAGGGAGC"
                 + "CAAGATGGCGCCACTGCACTCCAGCCTGGGCGATAGAGTGAGACTCCGTC"
                 + "TCAGAAAAAAAAGAAAAGAAACGAGGCACAGTCGCATGCACATGTAGTCC"
                 + "CAGTTACTTGAGAGGCTAAGGCAGGAGGATCTCTTGAGCCCAAGAGTTTG"
                 + "AGTCCAGCCTGAACAACATAGCAAGACATCATCTCTAAAATTTAAAAAAG"
                 + "GGCCGGGCACAGTGGCTCACACCTGTAATCCCAGCACTTTGGGAGGTGGA"
                 + "GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT";
		 
  char[] charArray = dna.toCharArray();
      // TAGG, CCAG, AGCC
      int tagg = 0, ccag = 0, agcc = 0;

      /*("GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA")을 보세요.
       * 우린 이 문자열을 "GATC"(인덱스 0~3), "ATCC"(인덱스 1~4), "TCCG"(2~5),
       * "CCGC"(3~6), ... 이런 식으로 확인합니다.
       *  그러다가 맨 마지막 줄("GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT")에서
       *  "ACAT"까지만 확인해야겠죠? "ACAT"은 인덱스 length - 4부터 length - 1까지이기 때문에 종결식을
       *  i < charArray.length - 3으로 잡으면 됩니다
       *  "ACAT"= length - 4부터 length - 1까지이다
       */
            
      char[] current = new char[4];

      for (int i = 0; i < charArray.length - 3; i++) {
          for (int j = 0; j < current.length ; j++) {
              current[j] = charArray[i + j];
          }

          // char[]을 String으로 변환
          // 예: ['a', 'b', 'c', 'd'] => "abcd"
          String seq = new String(current);

          switch (seq) {
              case "TAGG":
                  tagg++;
                  break;
              case "CCAG":
                  ccag++;
                  break;
              case "AGCC":
                  agcc++;
                  break;
          }
      }
      // 테스트
      System.out.println("TAGG: " + tagg);
      System.out.println("CCAG: " + ccag);
      System.out.println("AGCC: " + agcc);
	}

}
