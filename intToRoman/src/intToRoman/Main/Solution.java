package intToRoman.Main;

public class Solution {
    public String intToRoman(int num) {

            String numConvertedToRoman = "";
            int newNum = num;

            while(true){
                if(newNum / 1000 >= 1){
                    numConvertedToRoman += "M";
                    newNum -= 1000;
                }
                else{break;}
            }
               while(true){
                   if(newNum / 900 >= 1){
                       numConvertedToRoman += "CM";
                       newNum -= 900;
                   }
                   else{break;}
               }
                while(true){
                    if(newNum / 500 >= 1){
                        numConvertedToRoman += "D";
                        newNum -= 500;
                    }
                    else{break;}
                }
                while(true){
                    if(newNum / 400 >= 1){
                        numConvertedToRoman += "CD";
                        newNum -= 400;
                    }
                    else{break;}
                }
                while(true){
                    if(newNum / 100 >= 1){
                        numConvertedToRoman += "C";
                        newNum -= 100;
                    }
                    else{break;}
                }
                while(true){
                    if(newNum / 90 >= 1){
                        numConvertedToRoman += "XC";
                        newNum -= 90;
                    }
                    else{break;}
                }
                while(true){
                    if(newNum / 50 >= 1){
                        numConvertedToRoman += "L";
                        newNum -= 50;
                    }
                    else{break;}
                }
                while(true){
                    if(newNum / 40 >= 1){
                        numConvertedToRoman += "XL";
                        newNum -= 40;
                    }
                    else{break;}
                }
                while(true){
                    if(newNum / 10 >= 1){
                        numConvertedToRoman += "X";
                        newNum -= 10;
                    }
                    else{break;}
                }
                while(true){
                    if(newNum / 9 >= 1){
                        numConvertedToRoman += "IX";
                        newNum -= 9;
                    }
                    else{break;}
                }
               while(true){
                   if(newNum / 5 >= 1){
                       numConvertedToRoman += "V";
                       newNum -= 5;
                   }
                   else{break;}
               }
                while(true){
                    if(newNum / 4 >= 1){
                        numConvertedToRoman += "IV";
                        newNum -= 4;
                    }
                    else{break;}
                }
               while(true){
                   if(newNum  != 0){
                       numConvertedToRoman += "I";
                       newNum -= 1;
                   }
                   else{break;}
               }



            // Divide number by 1000, 900, 500, 400 etc. in if statement % == 0
            // If % == 0 then append roman numeral to string and update the number ( subtract 1000 from 5900
            // then repeat the division

        return numConvertedToRoman;

    }
}
