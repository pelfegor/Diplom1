# Отчёт о проведённом тестировании

## Краткое описание

Автоматизировно тестирование комплексного сервиса покупки тура, взаимодействующего с СУБД и API Банка.

Общее количество тест кейсов: **41**

## Статистика успешных/неуспешных кейсов

### При подключении к БД MySQL
<img width="1440" alt="Снимок экрана 2022-12-20 в 22 57 14" src="https://user-images.githubusercontent.com/105727342/208755434-11cdb990-4d2c-46e9-8328-90386e7a2e31.png">

- Успешных кейсов 51% (21 кейсов)
- Неуспешных кейсов 49% (20 кейсов)


### При подключении к БД PostgreSQL

<img width="1440" alt="Снимок экрана 2022-12-21 в 23 01 38" src="https://user-images.githubusercontent.com/105727342/208993160-31bb25d0-95d1-49c5-80db-566d2216ac2c.png">

- Успешных кейсов 51% (21 кейса)
- Неуспешных кейсов 49% (20 кейсов)


## Общие рекомендации

1. Исправить визуальные и орфографические ошибки ([ошибка в названии вкладки](https://github.com/pelfegor/Diplom1/issues/2) и [ошибка в слове Марракеш](https://github.com/pelfegor/Diplom1/issues/3))
2. Очень много ошибок связаны с неверными сообщениями об ошибках, необходимо это скорректировать
3. Для поля "Владелец" ввести ограничение на вводимые символы - только английские буквы(Имя и Фамилия)
4. Сделать кнопку "Продолжить" неактивной, если есть пустые и/или неправильно заполненные поля

Полный список найденных дефектов находится в [Issues](https://github.com/pelfegor/Diplom1/issues)
