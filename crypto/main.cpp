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


using namespace std;
int tmp = 0;
string s;
ifstream file;
ofstream ftmp;

void run(int ch){
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
    string buff;
   // char ch[N];
    while (!file.eof()) {
        getline(file, buff, ' ');//считываем пословестно
        // cout<<buff<<' ';
        //посимвольное чтение слов
        for (int i=0; i<buff.size(); i++){
        //  cout<<buff[i];
            int tmp = buff[i];
            cout<<endl;
            cout<<tmp;
        }
        break;
    }
    file.close();
}

int main() {
 
    //int i=0;
    file.open("tmptest.txt");
    
    if (file.is_open()){
        test();
   /*     while (i<6){
            tmp = file.get();
            if (char(tmp) != '\n')
            s = s+char(tmp);
            //run(tmp);
            i++;
        }
*/
    } else {
        cout<<"Couldn't open the file!";
    }

    cout<<endl;

}
