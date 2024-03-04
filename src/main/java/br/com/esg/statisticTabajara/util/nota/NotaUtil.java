package br.com.esg.statisticTabajara.util.nota;

import br.com.esg.statisticTabajara.domain.model.CandidatoNota;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class NotaUtil {

    public static List<CandidatoNota> loadDataFromCsv(String path) {
        try {
            List<CandidatoNota> listaRetorno = new ArrayList<CandidatoNota>();
            // BufferedReader reader = new BufferedReader(new
            // FileReader("C:\\temp\\classific_tcdf_23.CSV"));
            BufferedReader reader = new BufferedReader(new FileReader("C:\\temp\\SAMPLE.CSV"));
            String line = null;
            Integer lineCount = 0;
            while ((line = reader.readLine()) != null) {
                if (lineCount == 0) {
                    lineCount++;
                    continue;
                }
                String linha[] = line.split(";");
                CandidatoNota cn = new CandidatoNota(linha[0], linha[1], Double.parseDouble(linha[2].replace(",", ".")),
                        Double.parseDouble(linha[3].replace(",", ".")), Double.parseDouble(linha[4].replace(",", ".")));
                listaRetorno.add(cn);
                lineCount++;
            }
            return listaRetorno;

        } catch (Exception ex) {
            return null;
        }
    }
}
