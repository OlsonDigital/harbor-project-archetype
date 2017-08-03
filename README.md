# Harbor Project Archetype

[Olson Digital](http://www.digitalatolson.com/)

Used to create a new AEM Sites project built on [Harbor](https://github.com/OlsonDigital/harbor).

Currently in a Beta state.

## Compatibility

For use with AEM 6.3

## Dependency Versions

| Dependency  | Version |
| ----------- | ------- |
| Harbor      | 2.0.0-SNAPSHOT |
| CQ Component Maven Plugin | 5.0.0-SNAPSHOT |

## Example Usage

`mvn archetype:generate -DarchetypeGroupId=com.icfolson.aem.harbor -DarchetypeArtifactId=harbor-project-archetype -DarchetypeVersion=1.0.0-SNAPSHOT -DgroupId=com.clientname -DartifactId=client-name -DclientPrettyName="The Name of The Client" -Dversion=1.0.0-SNAPSHOT -DinteractiveMode=false`

## Versioning

Follows [Semantic Versioning](http://semver.org/) guidelines.