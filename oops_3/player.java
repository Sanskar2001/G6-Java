class Player {

        int playerId;
        int level;
        Gun gun;
        int health;
        boolean armour;
        boolean helmet;


        public Player(int playerId)
        {
            this.playerId=playerId;
            this.level=0;
            this.gun=new Gun(GunName.Pan, 0, 0, 20);
            this.health=100;
            this.armour=false;
            this.helmet=false;
        }

        public Player(int playerId,int level,Gun gun)
        {
            this.playerId=playerId;
            this.gun=gun;
            this.health=100;
            this.level=level;
            this.armour=false;
            this.helmet=false;
        }

        public Player(int playerId,int level,Gun gun,boolean armour,boolean helmet)
        {
            this.playerId=playerId;
            this.level=level;
            this.gun=gun;
            this.armour=armour;
            this.helmet=helmet;

            if(armour)
            this.health+=50;

            if(helmet)
            this.health+=50;

        }


}

