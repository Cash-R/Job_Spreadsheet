ENTRYPOINT = ...

$(ENTRYPOINT).java : 
	java -jar build/libs/Job_Spreadsheet.jar

run :
	java -jar ./build/libs/Job_Spreadsheet.jar
gbuild :
	./gradlew build
gclear :
	rm -rf ./build/
rebuild : 
	rm -rf ./build/
	./gradlew build