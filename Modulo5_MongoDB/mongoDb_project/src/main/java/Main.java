import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import static com.mongodb.client.model.Filters.eq;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));

        MongoDatabase db = mongoClient.getDatabase("biblioteca");

        MongoCollection<Document> clientes = db.getCollection("clientes");
        MongoCollection<Document> livros = db.getCollection("livros");

//        Document novoCliente = new Document("nome", "Fábio Alencar")
//                .append("id_cliente", 11)
//                .append("telefone", "119955588599")
//                .append("email", "fabioalencar@gmail.com")
//                .append("status_cliente", "0")
//                .append("tipo_cliente", "1")
//                .append("ponto_fidelidade", 0);
//
//        clientes.insertOne(novoCliente);

        // updateOne
        Document query = new Document().append("nome", "Fábio Alencar");

        Bson updates = Updates.combine(
                Updates.set("nome", "Fábio Assunção"),
                Updates.set("email", "fabioassuncao@gmail.com"));

        UpdateOptions options = new UpdateOptions().upsert(true);

        UpdateResult result2 = clientes.updateOne(query, updates, options);

        System.out.println("Modified document count: " + result2.getModifiedCount());
        System.out.println("Upserted id: " + result2.getUpsertedId());

        // findOne
//        Bson projectionFields = Projections.fields(
//                Projections.include("nome", "email", "telefone", "pontos_fidalidade"),
//                Projections.excludeId());
//
//        Document doc = clientes.find(eq("nome", "Fábio Assunção"))
//                .projection(projectionFields)
//                .first();
//
//        System.out.println(doc);

        // deleteOne
//        Bson query2 = eq("nome", "Fábio Assunção");
//        DeleteResult result3 = clientes.deleteOne(query2);
//        System.out.println("Deleted document count: " + result3.getDeletedCount());
    }



}
