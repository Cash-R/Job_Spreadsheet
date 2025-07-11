ENTRYPOINT = ...

$(ENTRYPOINT).java : 
	java -jar build/libs/Job_Spreadsheet.jar

#  Can't get the run command to work with wsl. To run, execute "./gradlew run" in a powershell/cmd terminal
run :
	java -jar ./build/libs/Job_Spreadsheet.jar
gbuild :
	./gradlew build
gclear :
	rm -rf ./build/
rebuild : 
	rm -rf ./build/
	./gradlew build