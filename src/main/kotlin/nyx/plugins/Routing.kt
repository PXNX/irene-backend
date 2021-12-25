package nyx.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import nyx.model.Page

fun Application.configureRouting() {

    routing {
        get("/story") {
            call.respond(

                //the dream
                /*     listOf(
                         Page("On a Friday evening, after a hard day at work after which I was shopping for the upcoming weekend, I open the door of my flat and enter. Just like any Thursday or Friday a few of my flat-mate's friends are here. I firstly walk straight to my room, unzip my helmet and put it in the big part of my backpack. Then I put the backpack down, open the front part, grab my phone and check it."),
                         Page("A message by this Italian girl I adore. Makes me smile a little. Gonna respond to it real quick. Tell her that I've just been shopping at the local discounter and scroll a bit around, re-reading a few messages makes me smile again."),
                         Page("It's been raining quite a bit while driving home, so I open up my jacket and hand it on the hangers at the door. Get rid of my shoes and socks as they tend to feel not very comfortable, I also change me wet trousers to something more convenient (and dry)."),
                         Page("Let's see what else was going on on Telegram. Ah yes.. some people have questions about implementing certain parts of their software, others want to know some language specific corrections. Gonna do that real quick while waiting for her to come online. Answering the more important stuff for a bunch of minutes. Still no response."),
                         Page("I feel suddenly quite hungry. It got a bit more quiet in the kitchen, so hopefully not an issue for then when I want to warm up the Gnocchis I made yesterday. I tried re-cooking them after this recipe she sent me and they turned out much better than I expected. Hopefully they taste just as good when heating them up a second time in the pan.", "https://www.seriouseats.com/thmb/LW0UCHW8DfDHcbCv7e0R95pjFPo=/960x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/__opt__aboutcom__coeus__resources__content_migration__serious_eats__seriouseats.com__images__2015__03__20150318-ricotta-gnocchi-how-to-food-lab-recipe-36a-8a6a3ffeca504735bbcbcc48ba5bc8a5.jpg"),
                         Page("I stand up from the bed, go to my laptop and start some update, might be done after dinner. My mouth waters, so it's definitely time for the kitchen now."),
                         Page("Take a sip of Almdudler and as I'm infront of it anyway, why not apply some perfume. Open the door, leave my room and close it again. Just a few steps forward and just as I walk around the corner the sporty flat-mate calls my name and introduces me to some slightly longer haired guy, some smaller one with a big tattoo on his left arm that's already been here last week. This time it seems that he brought his girl. And then these two young women who I oddly think to have met somewhere else before, but no clue where exactly."),
                         Page("The door rings, it's my flat-mate's girl. The inked guy and his girl follow my flat-mate to the door. They talk and laugh a bit and are gone."),
                         Page("The girl with a small nose ring starts talking with me, she has some accent which I can't really sort in. Somewhere from southern Europe maybe. All this basic stuff like where I'm from and what I do, it gets a bit more relaxing over time and after a little while my stomach goes off again. I stop leaning against the table and get my Gnocchi out of the fridge, prepare a pan and pour them in with a bit of sauce and let it heat up. We continue talking until the long haired looks up from his phone, wishes us a nice evening and leaves."),
                         Page("The taste of Gnocchi spreads through the air. I take a plate and ask if the girls wanted something and they also seem to be quite hungry. Luckily for them I often cook too much when making pasta, so there's enough for the three of us. It actually tastes better than yesterday. Interesting."),
                         Page("The one with a bright smile mentions that it tastes almost as good as it does at home, in bella Italia. I tell her I'm very honored about this rating, having made them from ground up myself. As the other one agrees, I feel pretty honored and tell them, that I got this recipe from an Italian friend. „Ja! Was auch sonst?\" shouts the smiling one and laughs."),
                         Page("After a bit more of talking about life here in Germany vs. Italy, how the people are etc. it's now time for then to leave aswell. They also tell me that they're only here for a few days and want to experience my region, so we set an appointment for the next day where we want to visit some of the most lovely places around here: Meersburg, Pfahlbauten Unteruhldingen and Insel Mainau."),
                         Page("While cleaning the dishes it just comes to my mind why I knew them... Holy shit!"),
                         Page("Back to my room, just as a close the door and lay on my bed, the notification bell rings, which means that it can only be one very special person as nobody else has notifications enabled."),
                         Page("If have something spectacular to tell her, or maybe not yet. I want to see where this goes first. She tells me that she's also been at the same discounter, but in another city. Is there a connection between us other than an emotional one? A bit of chatting after which I have to wish her a good night and after a while I fall asleep with many thoughts in my head and a big smile on my face."),
                         Page("On the next day I'm fully prepared for the trip, some apples and fresh bread my phone is charged, my jacket dry. It‘s gonna be a sunny day today, so hopefully I don‘t need it. Going outside and waiting for the girls to show up. I‘m 3 minutes to early, they are 7 minutes too late. Classic. We almost missed the train, butl uckily Deutsche Bahn is as unpunctual as always."),
                         Page("We explore Meersburg castle and take a little walk through the city until our ship to Mainau arrives. Trying out Icecream and getting it rated by the Italian experts. My green apple + Malaga icecream tastes quite well, but of course: „Also mir schmeckt‘s daheim besser....“, so I promise them even better icecream in my hometown. Suddenly the horn, we almost missed the time. Hurry up to the jetty.", "https://www.garten-europa.com/wp-content/uploads/2014/11/schloss-meersburg-am-bodensee-1920x1200.jpg"),
                         Page("The Katamaran sprints across Bodensee with some speed, the wind tousling through my longer hair, I check my phone in hope of a response by her. Last seen 03:27. She seems to have had a pretty fancy party night again."),
                         Page("As we approach Konstanz the boat is slowing down slowly. A few minutes later we‘re at the pier on Flower Island. We spend the next few hours there just walking across the island, enjoying the time, taking some funny Selfies, visiting all the Butterflies, taking a small trip though the palace and then it‘s time to go again. Been a cool day proofing that Germany can sometimes be more beautiful than Italy.","https://c4.wallpaperflare.com/wallpaper/143/965/119/tulip-park-mainau-island-wallpaper-preview.jpg"),
                         Page("Back home I‘m quite exhausted and can‘t wait to go on Telegram again. Whoa.. she wrote a lot. And excusing herself for not being around. That‘s not a problem at all, but it‘s quite cute nevertheless. So I answer all of the stuff she sent me and as she comes online I ask myself whether I should tell her or not. I‘m writing a small text explaining how all of this went and then she just comes online..."),
                         Page("Not the End..."),
                         Page("I simply wanted to tell you how much you mean to me.")
                     )
                                 */

                //birthday
                /*listOf(
                    Page("You know how valuable you are to me."),
                    Page("Today is your special day and I wanted to present you with something very special, because if not you who else would deserve something alike."),
                    Page("You're one day older than yesterday, one year older than last year. You might be with family, friends and probably partied a bit - or will go for that later on. You might have gotten a few gifts already and the following might serve as a nice addition to today's collection.\n"),
                    Page("You won't get anything physical today. That'll be reserved for whenever we may meet. It just feels right to give you something in person, rather than sending it as it fulfills the entire process with value."),
                    Page("I also think that gifts are more about the thought behind. Giving people what you think they deserve, sweetening up their day and making you feel what you just are: incredible."),
                    Page("You are the empress of this day \uD83D\uDC78\uD83C\uDFFB"),
                    Page("You deserve something unique ✨"),
                    Page(
                        "For that I wanted to give you two  major parts as a present: One that flows straight out of my mind and soul, one the flows straight out of my limbs and mouth.",
                        "https://dbdzm869oupei.cloudfront.net/img/sticker/preview/20032.png"
                    ),
                    Page("A combination of all I can give without being physically there."),
                    Page("The latter is in the form of the video I've sent you. I'm not a musician, but loved the idea to sing just for you. Makes me feel being closer to you."),
                    Page("The other part is, apart from all this text and the updated app, what's next.."),
                    Page("After all these weeks, the bad and good things that happened, you're on my mind pretty often. It's remarkable and interesting to see that after this long time you still push me and fill me up with strength. You truly are more refreshing than any coffee or good song."),
                    Page("Mille grazie ☺️"),
                    Page("Upcoming is a dream I already shared partially, but it continued since then. It connects to this wacky dream that was previously featured in this App."),
                    Page(
                        "After I went travelling with Laura  and Federica, I decided to reveal who I was and that I infact knew you and them, though all from pictures. You've seen some Selfie with me on it and also told them who I was a few minutes ago.",
                        "https://www.lindau.de/content/uploads/2019/02/Luftaufnahme_Insel-Nordost_Hari-Pulko-1.jpg"
                    ),
                    Page("They still quite confused, but also amazed about it. We continue with our trip through Lindau though. On our way to the harbor Federica comes up with an idea: \"Why not meet up all together?\" and Laura already starts planning a place or so."),
                    Page("I'm honestly a bit worried. Despite knowing you for some time now, despite trusting you from the bottom of my heart.. there's just that part that makes me feel unsure about the idea of meeting."),
                    Page("I would absolutely love to see you one day. No matter where. And still I feel insecure about it. I'm not bond or so by any means, but I'd like to make for a perfect impression when meeting. I fear it not turning out perfect."),
                    Page("On the other hand the will and interest on how the most meaningful italian woman might be like make the decision. I mumble \"Why not?\", then add \"How about the most meaningful place in Bavaria?\". \"Munich?\", Laura and Ferderica ask unisono."),
                    Page(
                        "\"The castle of castles. The dream of dreams.\" - just to make you feel like a little princess, part of your very own fairy tale, for this special day - \"Neuschwanstein!\", I respond with a little smirk.",
                        "https://i.pinimg.com/originals/c9/a3/82/c9a382534b7dee4da5df645880f6fafd.png"
                    ),
                    Page("Fast forward a few days.."),
                    Page(
                        "I can see you through the windows of the wagons.",
                        "https://www.zugreiseblog.de/wp-content/uploads/2017/05/lindau-zug.jpg"
                    ),
                    Page(" With a small backpack, a handbag and a big trolley. As you come by the door and seem to struggle stepping down the rather thin staircase, I reach out to help you with the luggage."),
                    Page("\"Hey. Kennen wir uns?\", I ask, followed by a cringy laughter."),
                    Page("I can't believe how happy I might be at this moment.\n\nYou also seem to be a little bit unsure in the first place, and maybe tired after the journey that's behind you."),
                    Page("Carrying most of your stuff we walk all the way through the train station. \"How was your trip?\" I ask and slowly but steadily we get a little conversation going ✨"),
                    Page("Wow."),
                    Page("How happy it just makes me to hear your voice..."),
                    Page(
                        "You make a few mistakes here and there, switch over to English or Italian if you don't know any further.\n\nAfter all your German got a bit more solid compared to what I knew it like.\n\nGood job!",
                        "https://cdn.discordapp.com/attachments/849654128099328009/893976577157779476/unknown.png"
                    ),
                    Page("Telling you this makes you quite happy aswell. \"Thanks for the compliment.\", but I actually didn't intend it to be a compliment. Your mood went from slightly tired to a much greater level."),
                    Page(
                        "We pack the luggage into the car, then I guide you around the island of Lindau. It's \"the paradise in the Bodensee\", we both can agree on that.\n",
                        "https://www.fineart-panorama.de/331465/im-hafen-von-lindau-am-bodensee.jpg"
                    ),
                    Page(
                        "Time to also try some ice cream at the best Eisdiele in town: Gelateria Cristallo. I go for Malaga and Banana, just because I haven't had them for a long time. You just keep on talking Italian with Cristallo's wife, he just shrugs his shoulders and we both get it for free today.",
                        "https://10619-2.s.cdn12.com/rests/original/109_509305914.jpg"
                    ),
                    Page(
                        "Walking back to the parking lot now...\n\nIt's pretty hot so we both gotta be fast with our tongues before the deliciousness melts away.\n\nAnd yes.. our ice cream holds up pretty well to your taste this time around."
                    ),
                    Page(
                        "You also tell me how nice you find the flair our town has, to which I respond \"only in summer\" as it's pretty empty in winter.",
                        "https://cdn.11880.com/cristallo-eiscafe_25457342_mw640h480_lindau-bodensee.jpg"
                    ),
                    Page(
                        "As we pass along certain spots or walk through tiny roads I tell some stuff about this or that thing and ultimately we end up right at the car. Time to drive home.\n\nDriving across the bridge there's the amazing view with the Alpes on the side and the lake to the bottom.",
                        "https://www.alpintreff.de/Bilder/poi/678/inselbruecke-lindau.jpg"
                    ),
                    Page("We arrive back home where I introduce you to my sisters and mum. Carina likes your style."),
                    Page("We go upstairs and I show you my room in which you can stay. I tidied it up a lot. Also a separate toilet and shower. I place down the luggage and after this hefty long trip you really want to shower before anything else. It's gotten a bit sweaty, so I'll leave you alone."),
                    Page(
                        "In the meantime me and my mum prepare Leberkäs, Maultaschen and some other small specialties and my sisters prepare the table. Weather is good, so why not eat on the patio?",
                        "https://cdn.discordapp.com/attachments/849654128099328009/893977532410515486/unknown.png"
                    ),
                    Page(
                        "Right as the Leberkäs comes out of the oven you come downstairs and I hand you a small letter...",
                        "https://cdn.khohinhstock.com/i/NORMAL-iStockPhoto%201024px-673063194.jpg"
                    ),
                    Page("I waited and won't deny it, but whenever I think about you, being quite delighted I get so excited, that I just can't hide it."),
                    Page("One of the worthiest people I ever met and because you are so special and so kind, when I go to bed or take a look at the chat you are always on my mind."),
                    Page(
                        "You may not be aware on the impact you can have on people, but it's just awesome to know a person just like you, Irene.\nPenso che il tuo personaggio sia molto bene.\n"
                    ),
                    Page(
                        "Without it, the sky would be less blue...\n\nAnd now a wonderful Happy Birthday for you \uD83C\uDF89",
                        "https://images.assetsdelivery.com/compings_v2/prapann/prapann1512/prapann151200028.jpg"
                    ),
                    Page("Auguri, mi venturi \uD83D\uDE0A")
                ) */

                //Christmas
                listOf(
                    Page("It's Heiligabend right now. We had Fondue as dinner, sat together and played a one of the games you recommended me."),
                    Page("We had some Plätzle and gifted each other a few cute things I think. We'll unpack the presents when Bescherung starts after coming back from church."),
                    Page("We don't deeply believe in God, but it' s some tradition here. Earlier we also praised the christmas tree with a few shots and some songs ."),
                    Page("I don't know how Christmas is celebrated in your family. Hope you all have an excellent time no matter what✨🎄"),
                    Page("Merry Christmas to You, your family and your friends.Hope you spend a nice time together, get loads of gifts and good stuff to eat😋"),
                    Page("Being unable to hand you a little present in person..."),
                    Page("maybe one day..."),
                    Page("I instead want to gift you a small snowy story❄️"),
                    Page("Hope you enjoy :)"),
                    Page("They say that the day the snow princess of the land of Winter was born was one of the most magical times in recorded history."),
                    Page("She was born on the winter solstice, December 21st, at 0:01, as the first snowflake of Winter began to fall from the sky."),
                    Page("Her father Lord Winter, who had ice white hair, and glacier green eyes, used his powers of Winter to capture the snowflake for his darling half mortal, half immortal daughter and made it into a necklace that graced her neck."),
                    Page("Many people of the land of Winter, which where mainly the frost giants, who had ice blue skin, snow white eyes, and clear blue hair , and ice dragons, with their array of blue colored scales; all agreed that the Lord of Winter's ever ever after, had finally came at last."),
                    Page("Which meant that the land of Winter could finally have peace and prosperity, something that they can only have once the rightful ruler finds their soul mate."),
                    Page("The reason was because only the soul mate of the rightful ruler could pass into the land of Winter, and put a curb on the harshest of winters."),
                    Page("But not everyone in the land of Winter was pleased with the birth of the baby snow princess, in fact one person in particular was not pleased at all."),
                    Page("This person was the Lord Winter's sister, a cold hearted woman, whom was now throughout the land for her cruelty."),
                    Page("Her title of Ice Princess fit her well, because nobody could melt her heart of Ice."),
                    Page("As time passed the snow princess began to grow into a beautiful young girl, with glacier blue hair, snowflake pale skin, and clear ice blue eyes, that could control the powers of Winter."),
                    Page("So one night when the powers where at their weakest the ice princess struck."),
                    Page("She attacked on the eve of the Summer solstice, and slain her brother Lord Winter and his wife, a mortal woman, who had managed to capture his heart, but she could not end the life of her little six year old niece."),
                    Page("Because the snow princess was born half mortal and half immortal, the only thing the ice princess could do was banish her to the land of Seasons, the realm outside of their own."),
                    Page("The world in which we exist."),
                    Page("After her niece was banished the ice princess took on a new name for herself, one that reflected her knew found status as ruler of the land of Winter, and filled with irony of how it started."),
                    Page("She became the Snow Queen."),
                    Page("However, since she was not the rightful ruler of the land of Winter, she lived in fear of the snow princess returning to reclaim her birth right."),
                    Page("The Snow Queen worried so much that she told all the people of the land of Winter that their beloved snow princess was dead, and that out of honor for the dead no one was aloud to speak the Snow princess's name."),
                    Page("The Snow Princess's name held great power, and if spoken in the land of Winter it could bring her back❄️"),

                    ////////////////// bild hier?

                    Page("A few things were mentioned between the lines. Some of those keep my mind busy for the last days."),
                    Page("When you're away, I don't want to spam this chat. Thus I favor wishing a good morning or night whenever you were there in the first place."),
                    Page("Everything in the universe is to some extend unique, but only a few things are special."),
                    Page("You deserve to be treated with calm caring charm, as in my opinion you truly are special - at least you make me feel good whatever positive happens."),
                    Page("Others should always be treated with respect and a certain value, no matter how they behave."),
                    Page("But there's people who are worth much more and hence deserve only the best. I may be overly careful with it, but somehow want to remain a sweet addition to your life rather than taking control over you."),
                    Page("I like you the way you are, I don't want to influence you too much. I just want to be there for you whenever you need me."),
                    Page("And I get very excited whenever you're here and there for me😄"),
                    Page("Ultimately I respect and value you more than almost any other person I got to know over the last years."),
                    Page("You're a rare mentally assimilated and supportive being that let's me strive💎"),
                    Page("Hopefully it doesn't sound creepy, but just having a picture, voice or some words on my mind makes me feel great."),
                    Page("I can't tell if you may be aware of the impact you can have, but one thing is for sure.."),
                    Page("You rock!"),
                    Page("And ultimately a little poem about the Snow queen..."),
                    Page("maybe about you😜"),
                    Page(
                        "Der Winter hält sich schon bereit,\n" +
                                "und mit dem Schnee kommt ihre Zeit,\n" +
                                "dann geht sie wieder auf Tournee\n" +
                                "in ihrem kalten Reich aus Schnee\n" +
                                "und trägt ihr weißes Flockenkleid."
                    ),
                    Page(
                        "Wenn dann noch aus dem Himmelszelt\n" +
                                "ein Meer von Flocken erdwärts fällt,\n" +
                                "trägt sie aus frischem Schnee und Eis\n" +
                                "ein Krönchen, es ist strahlend weiß,\n" +
                                "und schreitet durch die Winterwelt."
                    ),
                    Page(
                        "Als Königin, des Winters Braut,\n" +
                                "aus Schnee ist sie ihm angetraut.\n" +
                                "Seit Ewigkeit sind sie ein Paar,\n" +
                                "doch ist vorbei der Februar,\n" +
                                "geschieht es, dass sie langsam taut."
                    ),
                    Page(
                        "Nicht jeder ist ihr schon begegnet\n" +
                                "und niemand sieht sie, wenn es regnet.\n" +
                                "Nur wenn es kalt ist und dann schneit,\n" +
                                "zeigt sie sich bei Gelegenheit\n" +
                                "dem, der mit Fantasie gesegnet."
                    ),
                    Page("I hope you enjoyed those small texts☺️"),
                    Page("Christmas is the fest of kindness, sharing and caring - I just want to give something meaningful back."),
                    Page("I hope I could sweeten up your day as much as you sweeten up mine :)"),
                    Page("Frohe Weihnachten, Buon Natale and Merry Christmas, Irene✨🎄")
                )
            )
        }
    }
}