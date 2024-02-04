## Task 1
mkdir Kennel    
cd /home/nat/Kennel   
cat > home_animals    
cat > pack_animals    
cat home_animals pack_animals > file    
cat file    
mv file mans_friends    
ls -ali    

## Task 2
cd ..    
mkdir Kennel1    
cd /home/nat/Kennel1
mv mans_friends /home/nat/Kennel1
cd /home/nat/Kennel1   
ls -ali    

## Task 3
sudo wget -c https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb    
sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb 
sudo apt-get update    

## Task 4
sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-buildx-plugin_0.10.2-1~ubuntu.22.04~jammy_amd64.deb  
sudo dpkg -i docker-buildx-plugin_0.10.2-1~ubuntu.22.04~jammy_amd64.deb  
sudo dpkg -r docker-buildx-plugin