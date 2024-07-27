import MainHeader from '../layout/MainHeader'
import RoomCarousel from '../common/RoomCarousel'
import Parallax from '../common/Parallax'
import HotelService from '../common/HotelService'

const Home = () => {
  return (
    <section>
      <MainHeader />
      <div className="container">
        <RoomCarousel />
        <Parallax />
        <RoomCarousel />
        <HotelService />
        <Parallax />
        <RoomCarousel />
      </div>
    </section>
  )
}

export default Home
