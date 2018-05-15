package org.brumhilda.restendpoint;

import javax.ws.rs.*;

@Path("/restaurant")
public class ParserService {


    @GET
    @Produces("application/json")
    @Path("/ChIJD55B_ASUEkcRgoFJeL_VJjE")
    public String getPurkynka() {
        return
                "{\n" +
                        "    \"soupIncludedInPrice\":true,\n" +
                        "    \"menuForDays\": [\n" +
                        "    {\n" +
                        "        \"menu\":\n" +
                        "        [\n" +
                        "            {\"name\":\"Pikantní masová směs, bramboráčky\",\"price\":99,\"tags\":[\"kuracina\",\"bravcovina\",\"hovadzina\",\"zemiaky\"]},\n" +
                        "            {\"name\":\"Grilovaný losos, fettuccine s bazalkovým pestem\",\"price\":119,\"tags\":[\"ryba\",\"cestovina\"]},\n" +
                        "            {\"name\":\"Lívanečky s lesním ovocem, přelité vanilkovým krémem\",\"price\":92,\"tags\":[\"sladke\"]},\n" +
                        "            {\"name\":\"Roastbeef, opečené brambory, celerová remuláda\",\"price\":139,\"tags\":[\"hovadzina\",\"zemiaky\"]}\n" +
                        "        ],\n" +
                        "        \"soup\":\n" +
                        "        [\n" +
                        "            {\"name\":\"Polévka: Hovězí vývar s kapáním\"}\n" +
                        "        ],\n" +
                        "        \"date\": \"2018-05-01T00:00:00.000Z\"\n" +
                        "    }\n" +
                        "    \n" +
                        "    \n" +
                        "    ]\n" +
                        "}";
    }

    @GET
    @Produces("application/json")
    @Path("/ChIJ3VMlLwWUEkcRiEOim7E_5ks")
    public String getLiquidBread() {
        return
                "{\n" +
                        "    \"soupIncludedInPrice\":true,\n" +
                        "    \"menuForDays\": [\n" +
                        "    {\n" +
                        "        \"menu\":\n" +
                        "        [\n" +
                        "            {\"name\":\"GRILOVANÝ STEAK Z KRKOVICE SE ŠUNKOU A VEJCEM, DOMÁCÍ HRANOLKY\",\"price\":129,\"tags\":[\"bravcovina\",\"zemiaky\"]},\n" +
                        "            {\"name\":\"ČEVAPČIČI S HOŘČICÍ A CIBULKOU, PAŽITKOVÉ BRAMBORY S MÁSLEM\",\"price\":119,\"tags\":[\"bravcovina\",\"zemiaky\"]},\n" +
                        "            {\"name\":\"LISTOVÝ SALÁT S MLADÝM ŠPENÁTEM A CHŘESTEM, ANGLICKÝ ROASTBEEF, ČESNEKOVÝ DRESINK, ROZPEČENÝ TOAST\",\"price\":139,\"tags\":[\"hovadzina\",\"zelenina\"]}\n" +
                        "        ],\n" +
                        "        \"soup\":\n" +
                        "        [\n" +
                        "            {\"name\":\"POLÉVKA: GULÁŠOVÁ\"}\n" +
                        "        ],\n" +
                        "        \"date\": \"2018-05-07T00:00:00.000Z\"\n" +
                        "    }\n" +
                        "    ]\n" +
                        "}";
    }

    @GET
    @Produces("application/json")
    @Path("/ChIJP33V6QiUEkcRmVpGToDUnRI")
    public String getRestaurant2() {
        return
                "{\n" +
                        "    \"soupIncludedInPrice\":true,\n" +
                        "    \"menuForDays\": [\n" +
                        "    {\n" +
                        "        \"menu\":\n" +
                        "        [\n" +
                        "            {\"name\":\"Hospodský hovězí guláš z kližky, houskový knedlík\",\"price\":89,\"tags\":[\"hovadzina\",\"knedla\"]},\n" +
                        "            {\"name\":\"Grilovaný karé steak na zelených fazolkách s restovanou slaninou, šťouchané brambory\",\"price\":94,\"tags\":[\"bravcovina\",\"zemiaky\"]},\n" +
                        "            {\"name\":\"Dal Tadka (indické národní jídlo ze žluté čočky)\",\"price\":95},\n" +
                        "            {\"name\":\"Kuřecí prsíčko supreme pečené v bylinkách, smetanové velouté s chřestem a bílým vínem, mačkané brambory s hráškem\",\"price\":109,\"tags\":[\"kuracina\",\"zemiaky\"]}\n" +
                        "        ],\n" +
                        "        \"soup\":\n" +
                        "        [\n" +
                        "            {\"name\":\"Kuřecí vývar se zeleninou a fritátovými nudlemi)\"}\n" +
                        "        ],\n" +
                        "        \"date\": \"2017-11-03T00:00:00.000Z\"\n" +
                        "    }\n" +
                        "    ]\n" +
                        "}";
    }

    @GET
    @Produces("application/json")
    @Path("/ChIJlWwu9guUEkcRRpTpuTBDrrY")
    public String getRestaurant1() {
        return
                "{\n" +
                        "    \"soupIncludedInPrice\":true,\n" +
                        "    \"menuForDays\": [\n" +
                        "    {\n" +
                        "        \"menu\":\n" +
                        "        [\n" +
                        "            {\"name\":\"Štěpánská vepřová kotleta, rýže\",\"price\":88,\"tags\":[\"bravcovina\",\"ryza\"]},\n" +
                        "            {\"name\":\"Kuřecí stehenní steak, bramborové dukátky, dresing\",\"price\":88,\"tags\":[\"kuracina\",\"zemiaky\"]},\n" +
                        "            {\"name\":\"Zeleninový salát se sýrem, toasty\",\"price\":88,\"tags\":[\"zelenina\"]},\n" +
                        "            {\"name\":\"Smažená kotleta v bramboráku, zelný salát\",\"price\":128,\"tags\":[\"bravcovina\",\"zemiaky\",\"zelenina\"]},\n" +
                        "            {\"name\":\"Vaječná omeleta s rajčaty, opékané brambory\",\"price\":78,\"tags\":[\"zemiaky\",\"zelenina\"]}\n" +
                        "        ],\n" +
                        "        \"soup\":\n" +
                        "        [\n" +
                        "            {\"name\":\"Hrstková\"}\n" +
                        "        ],\n" +
                        "        \"date\": \"2017-11-03T00:00:00.000Z\"\n" +
                        "    }\n" +
                        "    ]\n" +
                        "}";
    }

    @GET
    @Produces("application/json")
    @Path("/ChIJw62LVgWUEkcRda0Iev1tBSE")
    public String getIndia() {
        return
                "{\n" +
                        "    \"soupIncludedInPrice\":false,\n" +
                        "    \"menuForDays\": [\n" +
                        "    {\n" +
                        "        \"menu\":\n" +
                        "        [\n" +
                        "            {\"name\":\"Chicken Masala (kuřecí kostky v jemně ostré omáčce)\",\"price\":95,\"tags\":[\"kuracina\",\"ryza\"]},\n" +
                        "            {\"name\":\"Chicken Curry (kuřecí kousky v kari omáčce)\",\"price\":95,\"tags\":[\"kuracina\",\"ryza\"]},\n" +
                        "            {\"name\":\"Dal Tadka (indické národní jídlo ze žluté čočky)\",\"price\":95},\n" +
                        "            {\"name\":\"Mix Thali (mix menu na děleném talíři)\",\"price\":125,\"tags\":[\"kuracina\",\"ryza\"]}\n" +
                        "        ],\n" +
                        "        \"soup\":\n" +
                        "        [\n" +
                        "            {\"name\":\"Tomato soup (rajčatová polévka)\",\"price\":22}\n" +
                        "        ],\n" +
                        "        \"date\": \"2018-05-07T00:00:00.000Z\"\n" +
                        "    }\n" +
                        "    ]\n" +
                        "}";
    }

//    @GET
//    @Produces("application/json")
//    @Path("/ChIJ3VMlLwWUEkcRiEOim7E_5ks")
//    public List<Parser> getAllParsers() {
//        return parserStore.getAllParsers();
//    }
//
//    @POST
//    @Consumes("application/json")
//    @Produces("application/json")
//    public Parser createParser(Parser parser) {
//        parserStore.addParser(parser);
//        return parser;
//    }
}