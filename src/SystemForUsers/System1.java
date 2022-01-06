package SystemForUsers;

import java.util.*;

//Есть класс система. Он только 1. Экземпляр этого класса создавать не нужно.
// Есть класс Пользователь. Нужно создать несколько пользователей. Пользователь может выполнять какие-то действия.
// Отдельно заводить класс под действия не нужно. Просто пусть будет в виде строки. Одно действия - одна строка
//Нужно реализовать подобие простенького аудита...без подключения к бд.
//case 1 Программа должна давать возможность добавить пользователя в систему и какие-то действия для него.
// Действий может быть больше одного.
// 2  Программа должна давать возможность удалить все действия пользователя из системы
// 3 Программа должна давать возможность удалить пользователя из системы
// 4 Программа должна давать возможность получить все действия из системы по конкретному пользователю.
//Программа должна давать возможность вывести всех пользователей со всеми действиям, для пользователя
//Придумать еще 1 уникальную функцию на свое усмотрение.
//Сделать все через HashMap. Реализовать обработки ошибок. Не менее 3-ех на ваше усмотрение.
//Можно не делать никакой интерфейс...а просто показать логику работы с этими классами в Main(кто очень хочет - можно сделать общение через консоль, но это не обязательно)
public class System1 {

    private static HashMap<Person, ArrayList<String>> personMap = new HashMap<>();

    public static HashMap<Person, ArrayList<String>> getPersonMap() {
        return personMap;
    }

   public static void addActUser (Person person, String action) {
        Scanner sc = new Scanner(System.in);
        for (Map.Entry<Person, ArrayList<String>> map : personMap.entrySet()) {
            Person needPerson = map.getKey();
            if (needPerson.getName().equals(person.getName())){
            ArrayList<String> values = map.getValue();
            values.add(action);
            }
        }
    }

    public static void delActions (Person person){

            for (Map.Entry<Person, ArrayList<String>> entry :
                    personMap.entrySet()) {
                if (entry.getKey().getName().equalsIgnoreCase(person.getName())) {
                    entry.getValue().clear();

                }
            }
        }

        public static HashMap<String,ArrayList<String>> showAllUsers (HashMap map) {
            map.entrySet();
            return map;



        }


    }