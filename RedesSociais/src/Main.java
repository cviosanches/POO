public class Main {

        public static void main(String[] args) {

            //Criando usuário
            Usuario user = new Usuario();
            user.setNome("caiosanches");
            user.setEmail("caio456caio@gmail.com");

            //Criando redes sociais
            Facebook fb = new Facebook();
            fb.senha = "homemaranha123";
            fb.numAmigos = 3000;

            GooglePlus gg = new GooglePlus();
            gg.senha = "caiopanqueca";
            gg.numAmigos = 10;

            Twitter tt = new Twitter();
            tt.senha = "homempanqueca";
            tt.numAmigos = 100;

            Instagram insta = new Instagram();
            insta.senha = "caiotaduro";
            insta.numAmigos = 2500;

            //Setando o usuário cadastrado como o usuário das redes sociais
            user.Usuario(fb);
            user.Usuario(gg);
            user.Usuario(tt);
            user.Usuario(insta);


            //Tratamento de dados
            for (int i = 0; i < user.redeSocial.length; i++) {
                if (user.redeSocial[i] != null) {
                    if (user.redeSocial[i] instanceof Facebook)
                    {
                        //Casting
                        Facebook auxfb = (Facebook) user.redeSocial[i];
                        auxfb.compartilhar();
                        auxfb.postarFoto();
                        auxfb.fazStreaming();
                        System.out.println("--------------------------");

                    }
                    else if (user.redeSocial[i] instanceof GooglePlus)
                    {
                        //Casting
                        GooglePlus auxgp = (GooglePlus) user.redeSocial[i];
                        auxgp.compartilhar();
                        auxgp.fazStreaming();
                        auxgp.curtirPublicacao();
                        System.out.println("---------------");
                    }

                    else if (user.redeSocial[i] instanceof Twitter)
                    {
                        //Casting
                        Twitter auxtt = (Twitter) user.redeSocial[i];
                        auxtt.compartilhar();
                        auxtt.curtirPublicacao();
                        auxtt.postarComentario();
                        System.out.println("---------------");
                    }

                    else if (user.redeSocial[i] instanceof Instagram)
                    {
                        //Casting
                        Instagram auxinsta = (Instagram) user.redeSocial[i];
                        auxinsta.postarComentario();
                        auxinsta.postarVideo();
                        auxinsta.postarFoto();
                        System.out.println("---------------");
                    }
                }
            }

        }

}



