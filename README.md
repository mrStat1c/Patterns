## Изучение паттернов

### Creational (порождающие)

---

#### Singleton (Одиночка)
Гарантирует наличие единственного экземпляра класса и предоставляет глобальную точку доступа

#### Builder (Строитель)
Позволяет создавать объекты пошагово и производить различные продукты, используя один и тот же процесс строительства

#### Prototype (Прототип, Клон)
Позволяет копировать объекты, не вдаваясь в подробности их реализации

#### Fabric method (Фабричный метод)
Определяет общий интерфейс для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов

#### Abstract fabric (Абстрактная фабрика)
Позволяет создавать семейства связанных объектов, не привязываясь к конкретным классам создаваемых объектов

---
### Structural (структурные)

---

#### Adapter (Адаптер)
Позволяет объектам с несовместимыми интерфейсами работать вместе

#### Facade (Фасад)
Предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку

#### Decorator (Декоратор, Обертка)
Позволяет динамически добавлять объектам новую функциональность, оборачивая их в полезные «обёртки»

#### Proxy (Заместитель)
Подставляет вместо реальных объектов специальные объекты-заменители, которые перехватывают вызовы к оригинальному объекту,
позволяя сделать что-то до или после передачи вызова оригиналу

#### Composite (Компоновщик, Дерево)
Позволяет сгруппировать множество объектов в древовидную структуру, а затем работать с ней так, как будто это единичный объект

#### Flyweight (Легковес, Приспособленец, Кэш)
Позволяет экономить память, разделяя общее состояние объектов между собой, вместо хранения одинаковых данных в каждом объекте

#### Bridge (Мост)
Разделяет один или несколько классов на две отдельные иерархии — абстракцию и реализацию, позволяя изменять их независимо друг от друга

---
### Behavioral (поведенческие)

---

#### Template method (Шаблонный метод)
Определяет скелет алгоритма, перекладывая ответственность переопределять некоторые шаги алгоритма на подклассы

#### State (Состояние)
Позволяет объекту менять свое поведение в зависимости от своего состояния

#### Strategy (Стратегия)
Выносит набор алгоритмов в собственные классы и делает их взаимозаменимыми

#### Observer (Наблюдатель, Слушатель, Подписчик)
Создаёт механизм подписки, позволяющий одним объектам следить и реагировать на события, происходящие в других объектах

#### Chain of responsibility (Цепочка обязанностей)
Позволяет передавать запросы последовательно по цепочке обработчиков. Каждый последующий обработчик решает, может ли он обработать запрос сам и стоит ли передавать запрос дальше по цепи

#### Command (Команда)
Позволяет заворачивать запросы или простые операции в отдельные объекты, выстраивать их в очереди, а также хранить историю и делать отмену

#### Iterator (Итератор)
Даёт возможность последовательно обходить элементы сложных коллекций, не раскрывая деталей их реализации

#### Mediator (Посредник)
Позволяет уменьшить связанность множества классов между собой, благодаря перемещению этих связей в один класс-посредник