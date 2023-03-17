FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD ExpenseManager-0.0.1-SNAPSHOT.jar ExpenseManager-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ExpenseManager-0.0.1-SNAPSHOT.jar"]
