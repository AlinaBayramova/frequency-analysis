//
//  main.cpp
//  crypto
//
//  Created by Alina Bairamova on 15.07.2018.
//  Copyright © 2018 non. All rights reserved.
//

#include <iostream>
#include <string>
#include <fstream>
#include <stdlib.h>
#include <stdio.h>


using namespace std;
int tmp = 0;
string s;
ifstream file;
int frequency[32] = {0}; //кол-во символов в алфавите(исключаем букву ё)
int M = 0; //кол-во знаков(без пробелов и др символов) в сообщении


//передаем сюда ackii символа
void run(char ch){
    //НЕВЕРОЯТНО, НО РАБОТАЕТ,НЕ ТРОЖЬ, АЛИНА!
     switch (ch) {
         case '\220':  //А
             frequency[0] += 1;
             break;
         case '\260':  //а
             frequency[0] += 1;
             break;
         case '\221': //Б
             frequency[1] += 1;
             break;
         case '\261': //б
             frequency[1] += 1;
             break;
         case '\222': //В
             frequency[2] += 1;
             break;
         case '\262': //в
             frequency[2] += 1;
             break;
         case '\223': //Г
             frequency[3] += 1;
             break;
         case '\263': //г
             frequency[3] += 1;
             break;
         case '\224': //Д
             frequency[4] += 1;
             break;
         case '\264': //д
            frequency[4] += 1;
             break;
         case '\225': //Е
             frequency[5] += 1;
             break;
         case '\265': //е
             frequency[5] += 1;
             break;
         case '\226': //Ж
             frequency[6] += 1;
             break;
         case '\266': //ж
             frequency[6] += 1;
             break;
         case '\227': //З
             frequency[7] += 1;
             break;
         case '\267': //з
             frequency[7] += 1;
             break;
         case '\230': //И
             frequency[8] += 1;
             break;
         case '\270': //и
             frequency[8] += 1;
             break;
         case '\231': //Й
             frequency[9] += 1;
             break;
         case '\271': //й
             frequency[9] += 1;
             break;
         case '\232': //К
             frequency[10] += 1;
             break;
         case '\272': //к
             frequency[10] += 1;
             break;
         case '\233': //Л
             frequency[11] += 1;
             break;
         case '\273': //л
             frequency[11] += 1;
             break;
         case '\234': //М
             frequency[12] += 1;
             break;
         case '\274': //м
             frequency[12] += 1;
             break;
         case '\235': //Н
             frequency[13] += 1;
             break;
         case '\275': //н
             frequency[13] += 1;
             break;
         case '\236': //О
             frequency[14] += 1;
             break;
         case '\276': //о
             frequency[14] += 1;
             break;
         case '\237': //П
             frequency[15] += 1;
             break;
         case '\277': //п
             frequency[15] += 1;
             break;
         case '\240': //Р
             frequency[16] += 1;
             break;
         case '\200': //р
             frequency[16] += 1;
             break;
         case '\241': //С
             frequency[17] += 1;
             break;
         case '\201': //с
             frequency[17] += 1;
             break;
         case '\242': //Т
             frequency[18] += 1;
             break;
         case '\202': //т
             frequency[18] += 1;
             break;
         case '\243': //У
             frequency[19] += 1;
             break;
         case '\203': //у
             frequency[19] += 1;
             break;
         case '\244': //Ф
             frequency[20] += 1;
             break;
         case '\204': //ф
             frequency[20] += 1;
             break;
         case '\245': //X
             frequency[21] += 1;
             break;
         case '\205': //x
             frequency[21] += 1;
             break;
         case '\246': //Ц
             frequency[22] += 1;
             break;
         case '\206': //ц
             frequency[22] += 1;
             break;
         case '\247': //Ч
             frequency[23] += 1;
             break;
         case '\207': //ч
             frequency[23] += 1;
             break;
         case '\250': //Ш
             frequency[24] += 1;
             break;
         case '\210': //ш
             frequency[24] += 1;
             break;
         case '\251': //Щ
             frequency[25] += 1;
             break;
         case '\211': //щ
             frequency[25] += 1;
             break;
         case '\252': //Ъ
             frequency[26] += 1;
             break;
         case '\212': //ъ
             frequency[26] += 1;
             break;
         case '\253': //Ы
             frequency[27] += 1;
             break;
         case '\213': //ы
             frequency[27] += 1;
             break;
         case '\254': //Ь
             frequency[28] += 1;
             break;
         case '\214': //ь
             frequency[28] += 1;
             break;
         case '\255': //Э
             frequency[29] += 1;
             break;
         case '\215': //э
             frequency[29] += 1;
             break;
         case '\256': //Ю
             frequency[30] += 1;
             break;
         case '\216': //ю
             frequency[30] += 1;
             break;
         case '\257': //Я
             frequency[31] += 1;
             break;
         case '\217': //я
             frequency[31] += 1;
             break;
         default:
             cout<<"Error in switch unit!";
             break;
     }
}
void test () {
    string buff; //сюда будем считываем слова(строку) из файла
    while (!file.eof()) {
        getline(file, buff, ' ');//считываем пословестно из файла
        //посимвольное чтение строки buff
        for (int i=0; i<buff.size(); i++){
            if (buff.at(i) >= '\200' and buff.at(i) <= '\277') { //исключаем управляющие символы и знаки препинания из сообщения
                run(buff.at(i));
                M++;
            }
        }
    }
    cout<<"Message length is: "<<M;
    cout<< endl;
}

    void analyze(){
        float analyze[32] = {0.00}; // массив результатов анализа
        for(int i=0; i<32; i++){
            analyze[i] = float(frequency[i])/M;
            printf("%.4f", analyze[i]);
            cout<<" ";
        }
}

int main() {
    string File_Name = "/Users/Alina/Desktop/crypto/DerivedData/crypto/Build/Products/Debug/test.txt";
    file.open(File_Name);
    
    
    if (file.is_open()){
        test();
        analyze();
    } else {
        cout<<"Couldn't open the file!";
    }
    
    file.close();
    cout<<endl;
    
}
