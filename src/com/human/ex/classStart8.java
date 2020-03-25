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

      /*("GATCCGCCCGCCTCGGCCTCCCAAAGTGCTGGGATTACAGGTGTGAGCCA")�� ������.
       * �츰 �� ���ڿ��� "GATC"(�ε��� 0~3), "ATCC"(�ε��� 1~4), "TCCG"(2~5),
       * "CCGC"(3~6), ... �̷� ������ Ȯ���մϴ�.
       *  �׷��ٰ� �� ������ ��("GGTGGGTAGATCACCTGACGTCAGGAGTTGGAAACCAGCCTGGCTAACAT")����
       *  "ACAT"������ Ȯ���ؾ߰���? "ACAT"�� �ε��� length - 4���� length - 1�����̱� ������ �������
       *  i < charArray.length - 3���� ������ �˴ϴ�
       *  "ACAT"= length - 4���� length - 1�����̴�
       */
            
      char[] current = new char[4];

      for (int i = 0; i < charArray.length - 3; i++) {
          for (int j = 0; j < current.length ; j++) {
              current[j] = charArray[i + j];
          }

          // char[]�� String���� ��ȯ
          // ��: ['a', 'b', 'c', 'd'] => "abcd"
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
      // �׽�Ʈ
      System.out.println("TAGG: " + tagg);
      System.out.println("CCAG: " + ccag);
      System.out.println("AGCC: " + agcc);
	}

}
