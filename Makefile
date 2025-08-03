#  Can't get the run command to work with wsl. To run, execute "./gradlew run" in a powershell/cmd terminal
# ENTRYPOINT = ...
# $(ENTRYPOINT).java : 
# 	java -jar build/libs/Job_Spreadsheet.jar
# run :
# 	java -jar ./build/libs/Job_Spreadsheet.jar

gbuild :
	clear
	./gradlew build
gclear :
	rm -rf ./build/
rebuild : 
	clear
	rm -rf ./build/
	./gradlew build