# spring-core
Practice tasks 
1.	git clone https://github.com/ckat/spring-context-annotation.lab  
2.	Создать Java Configuration файлы:
     a. Для repositorу классов
     b. Для service классов
     c. Для data initializers классов
     d. factory классов
3.	Создать корневой (основной) конфигурационный файл, подключить файлы из п1.
4.	Реализовать bean definitions для repository классов.
     a. Для создания UserRepository использовать класс org.shop.repository.factory.UserRepositoryFactory и соответствующий factory method
     b. Для создания OrderRepository необходимо передать параметр intitialSequence, значение которого должно быть взято из property файла.
5.	Реализовать bean definitions для data initializer классов
     a. SellerInitializer: требуется параметр типа Map<sellerId, sellerName>
     b. ProposalInitializer: использовать autowiring by name
     c. ProductInitializer: передать параметры в конструктор
     d. DataInitializer: объявить init метод
6.	Реализовать main method для ShopLauncher класса, запустить, проверить работоспособность
     Создать и инициализировать ApplicationContext
     Получить bean по типу
     Проверить работоспособность, что все data initializers отработали корректно
7.	*  Прикрутить логгирование при вызове основных методов, используя Spring AOP
8.	*  Создать свою аннотацию @InjectRandomInt - ставится над int полем, имеет 2 параметра maxValue и minValue. После инициализации бина, имеющего такое поле с аннотацией, записывать туда значение, среднее между minValue и maxValue.
