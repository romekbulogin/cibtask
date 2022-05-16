import dto.Billionaire
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import repository.billionaireRepository
import java.io.File

fun main() {
    val file = File("src/main/resources/Billionaire.csv").bufferedReader()
    val csvParser = CSVParser(
        file, CSVFormat.DEFAULT.withFirstRecordAsHeader()
            .withIgnoreHeaderCase()
            .withTrim()
    );

    var id: Long = 0
    for (csvRecord in csvParser) {
        billionaireRepository().addBillionaire(
            Billionaire(
                id = id++,
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
}
