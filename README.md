# handlebars-helpers-petrovich4j
Custom {{handlebars.java}} helper that enables Petrovich4j library usage 

## Petrovich-java
usage:
```
{{petrovich object formatString case='Accusative' gender=gender [firstName=name lastName=surname patronymic=patronymic]}}
```
or
```
{{petrovich formatString case='Dative' gender=gender firstName=name lastName=surname patronymic=patronymic}}
```
([*] - optional parameters)
Sample:
{{petrovich '{F} {I} {O}' case='Accusative' gender=user.gender
                    patronymic=user.middleName
                    lastName=user.lastName
                    firstName=user.name}}

formatString accepts:
 - {F} - surname in full form
 - {f} - surname in initials form
 - {I} - name in full form
 - {i} - name in initials form
 - {O} - patronymic in full form
 - {o} - patronymic in initials form
 - other character sequences keeps their state
 Sample: '{F} {I} {O}' will rendered to string 'LastName Name Patronymic',
 '{F}&nbsp;{i}{o}' will rendered to string 'LastName&nbsp;N.P.'

By default petrovich helper tries to get next fields from object:
 - firstName (as name)
 - lastName (as surname)
 - patronymic (as patronymic)
Can be override by directly passed hash-parameters (with such types) 
 
Possible gender values:
 - MALE
 - FEMALE
 - resolve (case insensitive) - try to resolve gender by patronymic (Male will turn if cannot 
 - any other will be passed to Petrovich as Gender.Both type


## License
Project is available under Apache License 2
