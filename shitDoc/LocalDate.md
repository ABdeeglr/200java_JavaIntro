# LocalDate.md



**初始化**:

```java
LocalDate date = LocalDate.now();
```

为什么他妈的不是用构造器新建的对象？



**方法**:

```java
// date is a LocalDate instance

date.getDayOfMonth(); // acc
date.getDayOfWeek(); // acc
date.getMonthValue(); // acc
date.plusDays(int n); // mut
date.minusDays(int n); // mut
```

很可怕... 如果没有良好的文档说明，这会变成一场灾难... 而且这不是有联系的。