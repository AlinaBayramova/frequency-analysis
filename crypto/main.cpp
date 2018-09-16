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

//передаем сюда ackii символа
void run(char ch){
    // int alphabet[33]; //кол-во символов в тексте
    //float frequency[33]; // массив результатов анализа
    //unsigned long int M = 0; // длина открытого сообщения(без пробелов и проч символов)
    /*switch (ch) {
     case "А":
     break;
     case "Б": break;
     default: break;
     }*/
    cout<<ch;
}
void test () {
    string buff; //сюда будем считываем слова(строку) из файла
    int M = 0; //кол-во знаков(без пробелов) в сообщении
    while (!file.eof()) {
        getline(file, buff, ' ');//считываем пословестно из файла
        //посимвольное чтение строки buff
        for (int i=0; i<buff.size(); i++){
            if (buff.at(i) >= '\200' and buff.at(i) <= '\277') { //исключаем управляющие символы и знаки препинания из сообщения
                cout<<buff[i]; //убрать!!!
                //todo: функция (run) заполняющая массив букв
              //  run(buff.at(i));
                M++;
            }
        }
        cout<<endl;
    }
    cout<<M;
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
