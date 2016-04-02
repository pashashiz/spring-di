## Multi module Spring DI

There is an example how to solve very common problem when we use
multiple modules which at the end will be used as single application.

Usually we meet the following problems:
- A low level module (for example, jar) needs to consume objects provided
by high a level application (for example, war) - **inject them**. For unit tests we should be able to
mock all the objects, provided by a high-level module.
- A high level module should easily consume services,
provided by a low level module - **autowire them**.

There is an example how to solve these problems with Spring DI