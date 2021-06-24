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