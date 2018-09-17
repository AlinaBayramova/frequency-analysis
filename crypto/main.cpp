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
int alphabet[32] = {0}; //кол-во символов в алфавите(исключаем букву ё)


//передаем сюда ackii символа
void run(char ch){
    // float frequency[33]; // массив результатов анализа
     switch (ch) {
         case '\220':  //А
             alphabet[0] += 1;
             break;
         case '\260':  //а
             alphabet[0] += 1;
             break;
         case '\221': //Б
             alphabet[1] += 1;
             break;
         case '\261': //б
             alphabet[1] += 1;
             break;
         case '\222': //В
             alphabet[2] += 1;
             break;
         case '\262': //в
             alphabet[2] += 1;
             break;
         case '\223': //Г
             alphabet[3] += 1;
             break;
         case '\263': //г
             alphabet[3] += 1;
             break;
         case '\224': //Д
             alphabet[4] += 1;
             break;
         case '\264': //д
            alphabet[4] += 1;
             break;
         case '\225': //Е
             alphabet[5] += 1;
             break;
         case '\265': //е
             alphabet[5] += 1;
             break;
         case '\226': //Ж
             alphabet[6] += 1;
             break;
         case '\266': //ж
             alphabet[6] += 1;
             break;
         case '\227': //З
             alphabet[7] += 1;
             break;
         case '\267': //з
             alphabet[7] += 1;
             break;
         case '\230': //И
             alphabet[8] += 1;
             break;
         case '\270': //и
             alphabet[8] += 1;
             break;
         case '\231': //Й
             alphabet[9] += 1;
             break;
         case '\271': //й
             alphabet[9] += 1;
             break;
         case '\232': //К
             alphabet[10] += 1;
             break;
         case '\272': //к
             alphabet[10] += 1;
             break;
         case '\233': //Л
             alphabet[11] += 1;
             break;
         case '\273': //л
             alphabet[11] += 1;
             break;
         case '\234': //М
             alphabet[12] += 1;
             break;
         case '\274': //м
             alphabet[12] += 1;
             break;
         case '\235': //Н
             alphabet[13] += 1;
             break;
         case '\275': //н
             alphabet[13] += 1;
             break;
         case '\236': //О
             alphabet[14] += 1;
             break;
         case '\276': //о
             alphabet[14] += 1;
             break;
         case '\237': //П
             alphabet[15] += 1;
             break;
         case '\277': //п
             alphabet[15] += 1;
             break;
         case '\240': //Р
             alphabet[16] += 1;
             break;
         case '\200': //р
             alphabet[16] += 1;
             break;
         case '\241': //С
             alphabet[17] += 1;
             break;
         case '\201': //с
             alphabet[17] += 1;
             break;
         case '\242': //Т
             alphabet[18] += 1;
             break;
         case '\202': //т
             alphabet[18] += 1;
             break;
         case '\243': //У
             alphabet[19] += 1;
             break;
         case '\203': //у
             alphabet[19] += 1;
             break;
         case '\244': //Ф
             alphabet[20] += 1;
             break;
         case '\204': //ф
             alphabet[20] += 1;
             break;
         case '\245': //X
             alphabet[21] += 1;
             break;
         case '\205': //x
             alphabet[21] += 1;
             break;
         case '\246': //Ц
             alphabet[22] += 1;
             break;
         case '\206': //ц
             alphabet[22] += 1;
             break;
         case '\247': //Ч
             alphabet[23] += 1;
             break;
         case '\207': //ч
             alphabet[23] += 1;
             break;
         case '\250': //Ш
             alphabet[24] += 1;
             break;
         case '\210': //ш
             alphabet[24] += 1;
             break;
         case '\251': //Щ
             alphabet[25] += 1;
             break;
         case '\211': //щ
             alphabet[25] += 1;
             break;
         case '\252': //Ъ
             alphabet[26] += 1;
             break;
         case '\212': //ъ
             alphabet[26] += 1;
             break;
         case '\253': //Ы
             alphabet[27] += 1;
             break;
         case '\213': //ы
             alphabet[27] += 1;
             break;
         case '\254': //Ь
             alphabet[28] += 1;
             break;
         case '\214': //ь
             alphabet[28] += 1;
             break;
         case '\255': //Э
             alphabet[29] += 1;
             break;
         case '\215': //э
             alphabet[29] += 1;
             break;
         case '\256': //Ю
             alphabet[30] += 1;
             break;
         case '\216': //ю
             alphabet[30] += 1;
             break;
         case '\257': //Я
             alphabet[31] += 1;
             break;
         case '\217': //я
             alphabet[31] += 1;
             break;
         default:
             cout<<"Error in switch unit!";
             break;
     }
}
void test () {
    string buff; //сюда будем считываем слова(строку) из файла
    int M = 0; //кол-во знаков(без пробелов) в сообщении
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
    //после того, как считали весь файл, выводим массив встречаемости символа в сообщении
    for (int i=0; i<32; i++)
        cout<<alphabet[i]<<" ";
    cout<< endl;
    cout<<"Message length is: "<<M;
}

int main() {
    file.open("test.txt");
    
    if (file.is_open()){
        test();
       
    } else {
        cout<<"Couldn't open the file!";
    }
    
    file.close();
    cout<<endl;
    
}
