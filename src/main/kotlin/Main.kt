import dto.Billionaire
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import services.billionaireServices
import java.io.File

fun main() {

    val file = File("src/main/resources/Billionaire.csv").bufferedReader()
    val csvParser = CSVParser(
        file, CSVFormat.DEFAULT.withFirstRecordAsHeader()
            .withIgnoreHeaderCase()
            .withTrim()
    );


    val bR = billionaireServices()
    for (csvRecord in csvParser) {
        bR.addBillionaire(
            Billionaire(
                name = csvRecord[0],
                netWorth = csvRecord[1],
                country = csvRecord[2],
                source = csvRecord[3],
                rank = csvRecord[4].toInt(),
                age = csvRecord[5],
                industry = csvRecord[6]
            )
        );
    }


    bR.printBestBillionaire(50)
    bR.printGroupByCountry()
    bR.printCountBillionaireByIndustries(50)
    bR.printGroupByIndustries()

}
