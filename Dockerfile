FROM openjdk:18
WORKDIR /home/rupesh/IdeaProjects/ExpenseManager
COPY . /home/rupesh/IdeaProjects/ExpenseManager
CMD ["java","-jar","ExpenseManager-0.0.1-SNAPSHOT.jar"]
