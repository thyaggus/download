const http = require('http'); // or 'https' for https:// URLs
const fs = require('fs');


for (let i = 0; i < 10; i++) {
    const file = fs.createWriteStream(`csv/stress-${i+1}.csv`);
    const request = http.get("http://localhost:7001/download/multi?multiplo=10", function(response) {
        response.pipe(file);

    // after download completed close filestream
        file.on("finish", () => {
            file.close();
            console.log(`Dowanlod ${i+1} completado`);
        });
    });
}