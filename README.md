"# Yunda0204" 

## JPA 쿼리 메서드와 JPQL 스니펫

| 키워드          | 예제 메서드 이름                                                      | JPQL 스니펫                                                      | 설명                                                        |
|-----------------|----------------------------------------------------------------------|-----------------------------------------------------------------|-----------------------------------------------------------|
| **And**         | `findByLastnameAndFirstname`                                         | `... where x.lastname = ?1 and x.firstname = ?2`                | 성(lastname)과 이름(firstname)이 모두 일치하는 경우를 찾습니다.  |
| **Or**          | `findByLastnameOrFirstname`                                          | `... where x.lastname = ?1 or x.firstname = ?2`                 | 성(lastname) 또는 이름(firstname) 중 하나가 일치하는 경우를 찾습니다. |
| **Is, Equal**   | `findByFirstname`<br>`findByFirstnameIs`<br>`findByFirstnameEquals`  | `... where x.firstname = ?1`                                     | 이름(firstname)이 일치하는 경우를 찾습니다.                    |
| **Between**     | `findByStartDateBetween`                                             | `... where x.startDate between ?1 and ?2`                       | 시작 날짜(startDate)가 지정된 두 날짜 사이에 있는 경우를 찾습니다.  |
| **LessThan**    | `findByAgeLessThan`                                                  | `... where x.age < ?1`                                          | 나이(age)가 지정된 값보다 작은 경우를 찾습니다.                  |
| **LessThanEqual**| `findByAgeLessThanEqual`                                             | `... where x.age <= ?1`                                         | 나이(age)가 지정된 값보다 작거나 같은 경우를 찾습니다.            |
| **GreaterThan** | `findByAgeGreaterThan`                                               | `... where x.age > ?1`                                          | 나이(age)가 지정된 값보다 큰 경우를 찾습니다.                    |
| **GreaterThanEqual** | `findByAgeGreaterThanEqual`                                       | `... where x.age >= ?1`                                         | 나이(age)가 지정된 값보다 크거나 같은 경우를 찾습니다.            |
| **After**       | `findByStartDateAfter`                                               | `... where x.startDate > ?1`                                    | 시작 날짜(startDate)가 지정된 날짜 이후인 경우를 찾습니다.         |
| **Before**      | `findByStartDateBefore`                                              | `... where x.startDate < ?1`                                    | 시작 날짜(startDate)가 지정된 날짜 이전인 경우를 찾습니다.         |
| **isNull, Null**| `findByAge(is)Null`                                                  | `... where x.age is null`                                       | 나이(age)가 null인 경우를 찾습니다.                            |
| **NotNull**     | `findByAge(Is)NonNull`                                               | `... where x.age not null`                                      | 나이(age)가 null이 아닌 경우를 찾습니다.                        |
| **Like**        | `findByFirstnameLike`                                                | `... where x.firstname like ?1`                                 | 이름(firstname)이 지정된 패턴과 일치하는 경우를 찾습니다.         |
| **NotLike**     | `findByFirstnameNotLike`                                             | `... where x.firstname not like ?1`                             | 이름(firstname)이 지정된 패턴과 일치하지 않는 경우를 찾습니다.     |
| **StartingWith**| `findByFirstnameStartingWith`                                        | `... where x.firstname like ?1 (parameter bound with appended %)` | 이름(firstname)이 지정된 문자열로 시작하는 경우를 찾습니다.        |
| **EndingWith**  | `findByFirstnameEndingWith`                                          | `... where x.firstname like ?1 (parameter bound prepended %)`   | 이름(firstname)이 지정된 문자열로 끝나는 경우를 찾습니다.          |
| **Containing**  | `findByFirstnameContaining`                                          | `... where x.firstname like ?1 (parameter bound wrapped in %)`  | 이름(firstname)이 지정된 문자열을 포함하는 경우를 찾습니다.        |
| **OrderBy**     | `findByAgeOrderByLastnameDesc`                                       | `... where x.age = ?1 order by x.lastname desc`                 | 나이(age)가 일치하고 성(lastname)을 내림차순으로 정렬합니다.       |
| **Not**         | `findByLastnameNot`                                                  | `... where x.lastname <> ?1`                                    | 성(lastname)이 지정된 값과 일치하지 않는 경우를 찾습니다.          |
| **In**          | `findByAgeIn(Collection<Age> ages)`                                  | `... where x.age in ?1`                                         | 나이(age)가 지정된 컬렉션에 포함되는 경우를 찾습니다.              |
| **NotIn**       | `findByAgeNotIn(Collection<Age> ages)`                               | `... where x.age not in ?1`                                     | 나이(age)가 지정된 컬렉션에 포함되지 않는 경우를 찾습니다.          |
| **True**        | `findByActiveTrue`                                                   | `... where x.active = true`                                     | active 필드가 true인 경우를 찾습니다.                            |
| **False**       | `findByActiveFalse`                                                  | `... where x.active = false`                                    | active 필드가 false인 경우를 찾습니다.                           |
| **IgnoreCase**  | `findByFirstnameIgnoreCase`                                          | `... where UPPER(x.firstname) = UPPER(?1)`                      | 이름(firstname)을 대소문자 구분 없이 일치하는 경우를 찾습니다.     |
